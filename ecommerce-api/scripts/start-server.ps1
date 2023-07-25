Write-Output '>> Iniciando o servidor para API de ecommerce...'

Write-Output '>> Executando build do pacote incluindo dependências...'
mvn -f ..\pom.xml package

Write-Output '>> Executando o servidor...'
java -cp ..\target\ecommerce-api-1.0-SNAPSHOT-jar-with-dependencies.jar com.ecommerce.EcommerceWebserver
