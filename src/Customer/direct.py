import time

def direct_io():
    for _ in range(5):
        data = input("Masukkan data: ")
        print("Diproses:", data)

start = time.time()
direct_io()
print("Waktu total:", time.time() - start)

