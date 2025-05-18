# 📱 Desafio POO - Modelagem do iPhone

Este projeto é uma solução para o desafio de Programação Orientada a Objetos (POO) proposto na plataforma DIO, inspirado no lançamento do iPhone em 2007. O objetivo foi modelar e implementar, em Java, um componente que representa um **iPhone** com suas funcionalidades principais:

- Reprodutor Musical 🎵  
- Aparelho Telefônico 📞  
- Navegador na Internet 🌐  

---

## 🧠 Funcionalidades modeladas

### 📻 Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 📞 Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌍 Navegador na Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

## 🧱 Estrutura do projeto

src/
└── br/
└── com/
└── joaovictor/
└── iphone/
├── interfaces/
│ ├── ReprodutorMusical.java
│ ├── AparelhoTelefonico.java
│ └── NavegadorInternet.java
├── modelos/
│ └── Iphone.java
└── app/
└── Main.java

## 🔄 Diagrama UML

Abaixo está o diagrama UML representando a modelagem do projeto.

![Diagrama UML iPhone](./uml/diagrama-iphone.png)

> O diagrama foi criado no [draw.io](https://drive.google.com/file/d/1qgRZU7CyHqOGnrUdnXIBeDC1ZdNSAV0W/view?usp=drive_link) e representa as interfaces e suas relações com a classe `Iphone`.

---

## 🚀 Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
