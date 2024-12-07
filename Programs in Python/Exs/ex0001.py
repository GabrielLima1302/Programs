"""
Desenvolver um programa de gestão de biblioteca que permita adicionar, remover, atualizar e analisar informações sobre livros.

Os parametros para adicionar o livro deve ser: nome, autor, isbn e quantidade

"""
#Variáveis globais:
livros = list()
#Funções:

def adiciona_livro(livro):
    if len(livro) >0:

        loc=None
        pergunta_inicial = input("Deseja adicionar livro existente?")

        if pergunta_inicial == "sim":
            isbn = input("Digite o código do livro a ser adicionado: ")

            isbn_existe = False
            for item in livro:
                if isbn == item[2]:
                    isbn_existe = True

            if not isbn_existe:
                print("Livro não consta no sistema, volte ao painel para adicionar o livro")
                return None

            for i in range (len(livro)):
                if isbn == livro[i][2]:
                    loc=i

            qtd_adicionados = int(input("Quantas unidades deseja adicionar?"))

            livro[loc][3] +=qtd_adicionados

    else:
        nome = input("Digite o nome do livro: ")
        autor = input("Digite o nome do autor do livro: ")
        isbn = input("Digite o código do livro: ")
        qtd = int(input("Digite quantas unidades desse livro serão adicionadas: "))

        for item in livro:
            if isbn == item[2]:
                print("Livro já consta no sistema, volte ao painel para adicionar mais unidades")
                return None

        livro.append([nome, autor, isbn, qtd])
        for a in range(len(livro)):
            print(livro)

        return None

def remove_livro(livro):
    loc=None
    isbn = input("Digite o código do livro: ")
    isbn_existe=False
    for item in livro:
        if isbn==item[2]:
            isbn_existe=True

    if not isbn_existe:
        print("Livro não consta no sistema, volte ao painel para adicionar o livro")
        return None
    else:
        for i in range (len(livro)):
            if isbn == livro[i][2]:
                loc=i

        print("Há: ",livro[loc][3]," unidades do livro")
        qtd_removidos = int(input("Quantas unidades deseja remover? "))

        if qtd_removidos > livro[loc][3]:
            print("Quantidade a ser removida excede a quantidade de livros no sistema, volte ao painel e adicione mais unidades")
            return None

        elif qtd_removidos == livro[loc][3]:
            del livro[loc]
            return None

        else:
            livro[loc][3] -= qtd_removidos
            return None

def informa_livro(livro):
    isbn = input("Digite o código do livro que deseja ver informações: ")
    isbn_existe=False
    for item in livro:
        if isbn==item[2]:
            isbn_existe=True
    if not isbn_existe:
        print("Livro não consta no sistema, volte ao painel para adicionar o livro")
        return None

    else:
        for i in range (len(livro)):
            if isbn == livro[i][2]:
                print(livro[i])

    return None

def atualiza_livro(livro):
    loc=None
    isbn = input("Digite o código do livro que deseja atualizar: ")
    isbn_existe=False
    for item in livro:
        if isbn==item[2]:
            isbn_existe=True

    if not isbn_existe:
        print("Livro não consta no sistema, volte ao painel para adicionar o livro")
        return None
    else:
        for i in range(len(livro)):
            if isbn == livro[i][2]:
                loc=i
        escolha = int(input("O que você deseja atualizar? \n (1)Nome \n (2)Autor \n (3)Código"))
        if escolha == 1:
            novo_nome = input("Qual o novo nome do livro?")
            livro[loc][0] = novo_nome

        elif escolha == 2:
            novo_autor = input("Qual o novo autor?")
            livro[loc][1] = novo_autor

        elif escolha == 3:
            novo_isbn = input("Qual o novo código do livro?")
            livro[loc][2] = novo_isbn


    return None

def painel_funcionario(livro):
    print("-"*10)
    print("Bem vindo ao painel do funcionário: ")
    print("-"*10)

    while True:
        escolha = int(input("\nEscolha o que deseja fazer: \n (1)Adicionar livro \n (2)Remover livro \n (3)Informações do livro \n (4)Atualizar livro \n (5)Fechar programa \n\n::"))

        if escolha == 1:
            adiciona_livro(livro)

        elif escolha == 2:
            remove_livro(livro)

        elif escolha == 3:
            informa_livro(livro)

        elif escolha == 4:
            atualiza_livro(livro)
        elif escolha == 5:
            return None

#Main

running=True
print("-"*10)
senha = input("Digite sua senha: ")
if senha == "123":
    painel_funcionario(livros)























