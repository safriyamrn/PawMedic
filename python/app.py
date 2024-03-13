pwd = "123"

import sqlalchemy

connection = sqlalchemy.connect(user="postgres" , password=pwd,
             host="127.0.0.1", port="5432" , database="PawMedic")

cur = connection.cursor()

cur.execute("SELECT version();")
record = cur.fetchone()
print("ter koneksi - ", record)

cur.execute("""SELECT table_name FROM information_schema.tables
                WHERE table_schema = 'public'""")

for table in cur.fetchall():
    print(table)

#buat tabel
    

#memasukno data



insert_query = "INSERT INTO tb_login (username,password) VALUES('rico123','ganteng')"
cur.execute(insert_query)
connection.commit()

cur.execute("SELECT * from tb_login")
record = cur.fetchall()
record

#memperbarui data
update_query = """update tb_login set password = 'gantengbanget' where username = 'rico123'"""
cur.execute(update_query)
connection.commit()

#cur.execute("SELECT * from tb_login")
print("Result", cur.fetchall())

