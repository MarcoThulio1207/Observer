# Atividade Observer - Prof. Rafaela
Alunos: Marco Thulio Martins: RA - 4231921901 || Breno Jesus Andrade de Oliveira: RA - 4231921291 || GitHub : bJesuss
## Escopo da atividade:
PRÁTICA - NOTIFICAÇÃO DE ESTOQUE

Uma loja online deseja implementar um sistema de notificação de estoque para que produtos esgotados possam ser monitorados por diferentes departamentos. Sempre que um produto esgotado voltar ao estoque, os departamentos interessados devem ser notificados para que possam tomar as ações apropriadas.
Os departamentos que precisam ser notificados são:

Vendas: O departamento de vendas precisa saber quando um produto volta ao estoque para atualizar a disponibilidade no site e informar clientes que aguardam.

Marketing: A equipe de marketing quer ser informada para promover o produto nas redes sociais.

Compras: O departamento de compras precisa ser notificado para monitorar os níveis de estoque e planejar novos pedidos com fornecedores.

Requisitos:

a) Crie uma interface Observer com o método update, que recebe uma mensagem de atualização.
b) Crie uma interface Estoque com métodos para registrar, remover e notificar observadores.
c) Implemente a classe concreta EstoqueProduto, que representa o estoque de um produto específico e notifica todos os observadores quando o produto volta ao estoque.
d) Implemente classes concretas para cada tipo de observador (DepartamentoVendas, DepartamentoMarketing e DepartamentoCompras) que recebem as atualizações e tomam ações específicas.
e) Na classe Principal, simule o reabastecimento de produtos e verifique se todos os observadores são notificados corretamente.