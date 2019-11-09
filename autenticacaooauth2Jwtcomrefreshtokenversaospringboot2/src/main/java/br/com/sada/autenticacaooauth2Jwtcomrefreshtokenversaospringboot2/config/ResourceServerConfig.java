package br.com.sada.autenticacaooauth2Jwtcomrefreshtokenversaospringboot2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableWebSecurity
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Objeto que cria os usuarios
		auth.inMemoryAuthentication()
				// .withUser("admin").password("{noop}admin").roles("ROLE").and()
				// .withUser("usuario").password("{noop}usuario").roles("USER");
				.withUser("admin").password("admin").roles("ROLE").and()
				.withUser("usuario").password("usuario")
				.roles("USER");

	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		// Objeto que cria as regras de autenticação.
		http.authorizeRequests().antMatchers("/categorias").permitAll()

				.anyRequest().authenticated().and()

				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().csrf().disable();

	}

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.stateless(true);
	}

}
