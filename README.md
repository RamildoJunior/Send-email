Neste projeto, desenvolvi dois microservices:

User Microservice
Email Microservice
Implementei a comunicação assíncrona entre eles utilizando RabbitMQ, além do envio de e-mails com SMTP do Gmail. O objetivo foi criar uma arquitetura escalável e desacoplada, garantindo eficiência na troca de mensagens entre os serviços.

🛠 Tecnologias Utilizadas
Spring Boot para desenvolvimento dos microservices
RabbitMQ para comunicação assíncrona
PostgreSQL como banco de dados
SMTP do Gmail para envio de e-mails
📌 Funcionalidades Implementadas
Desenvolvimento dos microservices User e Email
Configuração e integração do RabbitMQ
Criação do Producer e Consumer para troca de mensagens
Conexão com RabbitMQ na CloudAMQP
Implementação do envio de e-mails via SMTP do Gmail
⚙️ Preparação do Ambiente
Para rodar o projeto, você precisará de:

JDK 17
Maven
Postman (para testar os endpoints)
PgAdmin (PostgreSQL)

📂 Como Rodar o Projeto
Clone este repositório:
git clone https://github.com/seu-usuario/microservices-na-pratica.git
Configure as variáveis de ambiente (RabbitMQ, SMTP, etc)
Compile e execute os microservices via Maven ou sua IDE
Teste os endpoints com Postman
