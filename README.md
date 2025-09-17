# 📦 Desafio: Componentes e Injeção de Dependência

Formação **Desenvolvedor Moderno**  
Módulo: **Back end**  
Capítulo: **Componentes e injeção de dependência**  

---

## 📝 Descrição
Aplicação em **Java 21 + Spring Boot (Spring Web)** que calcula o valor total de um pedido considerando valor básico, desconto e frete.  
A saída é exibida no log do terminal.

---

## ⚙️ Estrutura
- `OrderService`: operações relacionadas a pedidos
- `ShippingService`: operações relacionadas a frete
-  `OrderController`: endpoint REST para cálculo do pedido
- `OrderTotalDTO`: DTO que retorna código e valor total do pedido

---

## ▶️ Como executar

1. **Via aplicação (ShippingApplication)**


    Abra o projeto na sua IDE (IntelliJ, Eclipse, VS Code)

    Execute a classe principal ShippingApplication como uma aplicação Java


2. **Via Maven:**

```bash
git clone https://github.com/matheusfmf/shipment.git
cd shipment
./mvnw spring-boot:run
````

## 💻 Como testar a API

Você pode utilizar qualquer ferramenta de requisições HTTP com a qual se sinta mais confortável: Postman, Insomnia, Bruno ou qualquer outra de sua preferência.

---

### 🔹 Endpoint principal: Calcular valor total do pedido

**POST** `/orders/calculate`

**Exemplo 1:**
**Request Body (JSON)**
```json
{
  "code": 1034,
  "basic": 150.0,
  "discount": 20.0
}
````
**Response Body (JSON):**
```json
{
  "code": 1034,
  "total": 132.0
}
````
**Exemplo 2:**
**Request Body (JSON)**
```json
{
  "code": 2282,
  "basic": 800.0,
  "discount": 10.0
}
````
**Response Body (JSON):**
```json
{
  "code": 2282,
  "total": 720.0
}
````
**GET** `/orders/lastOrder`

**Retorna o último pedido cadastrado via POST /orders/calculate**

**OBS:**
**Retorna um erro caso nenhum pedido tenha sido cadastrado ainda:**
```json
{
  "timestamp": "2025-09-17T01:30:00.123+00:00",
  "status": 500,
  "error": "Internal Server Error",
  "message": "Nenhum pedido cadastrado ainda!",
  "path": "/orders/last"
}

````