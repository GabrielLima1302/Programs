def set_pirocas():

    pirocas = [bool(int(input("Digite 1 para sim, 0 para não> Primeiro para empregado, depois para ferias:"))) for i in range (2)]
    if pirocas[0] and not pirocas[1]:
        return True
    else:
        return False
print(set_pirocas())

