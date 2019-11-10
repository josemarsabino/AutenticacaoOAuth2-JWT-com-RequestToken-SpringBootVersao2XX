# AutenticacaoOAuth2-JWT-com-RequestToken-SpringBootVersao2XX
Considerar que o projeto de nome "AutenticacaoOAuth2-JWT-SpringBootVersao2XX" está funcionando corretamente. Projeto disponível no git.

# Método
@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

.authorizedGrantTypes("password","refresh_token")
.accessTokenValiditySeconds(60)
.refreshTokenValiditySeconds(3600 * 24);


# Método

@Override
public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
	 endpoints
	
.reuseRefreshTokens(false)
	 
