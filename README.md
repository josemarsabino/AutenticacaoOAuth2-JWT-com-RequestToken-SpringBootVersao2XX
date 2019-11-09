# AutenticacaoOAuth2-JWT-com-RequestToken-SpringBootVersao2XX
Levando com consideração que autenticação com o token tradicional está funcionando o que vai mudar para se gerar um token apartir de um refresh token seriam as linhas


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
	 
