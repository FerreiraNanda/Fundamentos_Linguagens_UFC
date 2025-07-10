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
