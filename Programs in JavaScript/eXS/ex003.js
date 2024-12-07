const podeDirigir = true
if(podeDirigir) {
    console.log('Ela pode dirigir')
}
const saldoEmConta = 1 //1=true , 0=false
if(!saldoEmConta) {
    console.log("Não tem saldo!")
}

const boolComString = "Ola"
console.log('!!boolComString',!!boolComString)

console.log('!boolComString',!boolComString)

console.log(
    'negação + forçar o booleano',
    ! (!!boolComString)
)
