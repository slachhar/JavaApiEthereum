#
##
docker build -t blockchain-app .  # This command use Dockerfile

docker-compose up --build # This command use docker-compose.yml file

whenever we are getting insufficient funds exception.
Please check if contract address and privatekey is updated from docker container.

copy web3j-cli from https://github.com/hyperledger-web3j/web3j-cli/releases
add it to classpath: export PATH=$PATH:/home/shefali/web3j-1.4.0

web3j generate solidity -b SimpleStringStorage.bin -a SimpleStringStorage.abi -p com.Blockchain.Microservice.blockchain -o solidityResources/
