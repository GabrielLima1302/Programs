import pyautogui
from time import sleep

pyautogui.click(969,544,duration=0.5)
pyautogui.write("Gabriel")
pyautogui.click(981,572,duration=0.5)
pyautogui.write("123")
pyautogui.click(853,609,duration=0.5)

with open('produtos.txt','r') as arquivo:
    for linha in arquivo:
        produto = linha.split(',')[0]
        quantidade = linha.split(',')[1]
        preco = linha.split(',')[2]
        pyautogui.click(630,525,duration=0.5)
        pyautogui.write(produto)
        pyautogui.click(625,557,duration=0.5)
        pyautogui.write(quantidade)
        pyautogui.click(643,595,duration=0.5)
        pyautogui.write(preco)
        pyautogui.click(499,785,duration=0.5)

#630,525
#625,557
#643,595
#499,785