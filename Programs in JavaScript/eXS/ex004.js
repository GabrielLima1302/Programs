const pokemon = [
    'Bulbassaur', 'Pikachu',
    'Squirtle', 'Charmander'
] // 0=Bulbassaur, 1=Pikachu, 2=Squirtle, 3=Charmander

console.log(pokemon[0])

const minhaLista = []
const minhaListaDeTarefas= [
    'mandar email',
    'colocar comida para o cachorro',
    'limpar o quarto'
]

console.log(minhaListaDeTarefas[1])

console.log(minhaListaDeTarefas.length) // Quantidade de itens no array

minhaListaDeTarefas.push('formatar o computador') //Adicionar item no final da lista
console.log(minhaListaDeTarefas)

const ultimo = minhaListaDeTarefas.pop() //Pegar o valor removido no ultimo item do array
console.log(ultimo, minhaListaDeTarefas)

const primeiro = minhaListaDeTarefas.shift() //Pegar o valor removido no primeiro item do array
console.log(primeiro, minhaListaDeTarefas)

const quarto = minhaListaDeTarefas.splice(1,1)//Pego o valor removido no item escolhido no array, nesse caso o item de indice 1
console.log(quarto, minhaListaDeTarefas)
