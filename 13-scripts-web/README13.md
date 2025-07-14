# Desafio 13 – Linguagens para Scripts e Web

Este desafio propõe a criação de um script automatizado utilizando uma linguagem de script moderna. A solução apresentada foi desenvolvida em Python com uso do módulo `requests`, aplicando-se ao contexto de automação de download de imagens* da web.

---

## Objetivo

- Utilizar uma linguagem de script (Python) para automatizar uma tarefa útil e realista;
- Demonstrar o uso de módulos padrão (`os`, `requests`);
- Manipular dados e interagir com a web;
- Criar um diretório local e salvar arquivos baixados automaticamente.

---

## `imagensWeb.py`

```python
import os
import requests

urls = [
    "https://conexaoplaneta.com.br/wp-content/uploads/2023/07/comedy-pet-abre-conexao-planeta-1024x708.jpg",
    "https://leianoticias.com.br/wp-content/uploads/2020/02/tired-bumblebees4.jpg",
    "https://static.nationalgeographicbrasil.com/files/styles/image_3200/public/comedy-wildlife-awards-squirel-stop.webp?w=1190&h=888"
]

output_dir = "imagens_baixadas"

os.makedirs(output_dir, exist_ok=True)

for i, url in enumerate(urls, start=1):
    try:
        response = requests.get(url, timeout=10)
        response.raise_for_status()
        ext = url.split("?")[0].split('.')[-1] 
        file_path = os.path.join(output_dir, f"imagem_{i}.{ext}")
        with open(file_path, "wb") as f:
            f.write(response.content)
        print(f"Imagem {i} salva em: {file_path}")
    except Exception as e:
        print(f"Falha ao baixar {url}: {e}")
```

---

## Explicação

1. Define uma lista de URLs de imagens públicas;
2. Cria um diretório local chamado `imagens_baixadas`, se ainda não existir;
3. Faz o download de cada imagem usando `requests.get()`;
4. Salva os arquivos localmente com nomes automáticos (`imagem_1.jpg`, etc.);
5. Exibe mensagens de sucesso ou erro para cada download.

---

## Conclusão

Este script demonstra como a linguagem Python pode ser usada para automatizar tarefas repetitivas, como o download em lote de imagens, usando apenas bibliotecas simples como `requests` e `os`. Trata-se de uma solução prática, reutilizável e compatível com os requisitos do desafio.
