# 💈 Thávma BarberPay — Sistema de Gestão de Pagamentos

Sistema desenvolvido para automatizar o controle de pagamentos, serviços e clientes da **Thávma Barbearia**, substituindo o controle manual em planilhas e anotações físicas.

O objetivo é centralizar o processo de registro de serviços prestados, barbeiros responsáveis, clientes, descontos e formas de pagamento — gerando dados organizados para relatórios e gestão financeira.

---

## 🧰 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3**
  - Spring Web
  - Spring Data JPA
  - Validation
- **MySQL (Aiven Cloud)**
- **Lombok**
- **MapStruct**
- **SpringDoc / Swagger**
- **DBeaver** (para gerenciar o banco)
- **Maven** (gerenciamento de dependências)

---

## ⚙️ Funcionalidades Principais

✅ Cadastro de barbeiros  
✅ Cadastro de produtos e serviços (com preço)  
✅ Cadastro de clientes (nome e telefone)  
✅ Registro de pagamentos:
  - seleção do barbeiro responsável  
  - associação de cliente (novo ou existente)  
  - múltiplos serviços/produtos com quantidade  
  - campo de desconto  
  - forma de pagamento (PIX, dinheiro, cartão etc.)
✅ Armazenamento completo no banco de dados  
✅ Base para relatórios de faturamento por barbeiro, forma de pagamento e data

---

## 🧱 Estrutura das Entidades

