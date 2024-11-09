# 📚 Laporan Pratikum Pemrograman Berorientasi Objek

Selamat datang di laporan pratikum **Pemrograman Berorientasi Objek**! 🎉😄

## 📖 Deskripsi

Laporan ini menjelaskan aplikasi Java berbasis GUI menggunakan `Java Swing` dan `JPA `(Java Persistence API) untuk mengelola data mata kuliah dengan sistem operasi CRUD (Create, Read, Update, Delete). Data mata kuliah yang ditampilkan dalam tabel berisi informasi Kode MK, SKS, Nama Mata Kuliah, dan Semester Ajar, yang kemudian disimpan kedalam database menggunakan pendekatan persistence.

Pada aplikasi ini menggunakan `EntityManager` dari `JPA` untuk menghubungkan data secara langsung dengan database dan menyederhanakan proses pengelolaan data. Pada operasi `CRUD` (Create, Read, Update,Delete) maka sistem secara otomatis memperbarui tabel dan menampilka data terbaru. Selain itu, terdapat botton `cetak` dengan  menggunakan `JasperReports` untuk menghasilkan laporan data yang dimasukkan serta menyediakan button `upluod` yang dapat digunakan untuk mengimpor data dari file CSV.💻✨

🔗 Langkah - langkah :

1. Membuat kelas Entity Classes from Database
   ![image](https://github.com/user-attachments/assets/f539bf12-6526-4277-b17e-92a77cb4361d)

2. Memilih JDBC
   ![image](https://github.com/user-attachments/assets/ccbb9704-fe5f-4d78-ab21-02799e0f6394)

3. Ketika berhasil maka akan muncul package baru yaitu META-INF
   ![image](https://github.com/user-attachments/assets/365b06c7-88f8-428d-8d85-a7fc23326e69)

4. Pada persistence.xml terdapat Include Entity classes
   ![image](https://github.com/user-attachments/assets/07e5101b-70e9-453e-aadd-2ab660b725b8)

5. Maka pada package MataKuliah terdapat entity classes Matakuliah_1
   ![image](https://github.com/user-attachments/assets/83592594-330a-475a-86de-4a58546781fd)

6. Memasukkan source code pada button insert pada java swing
   ![image](https://github.com/user-attachments/assets/a7b0a005-5fa5-4198-b27c-6074425e5fd6)

7. Memasukkan source code pada button delete
   ![image](https://github.com/user-attachments/assets/3142e98a-4376-4956-a614-9e3d33f47d8a)

8. Memasukkan source code update
    ![image](https://github.com/user-attachments/assets/504147f8-34d5-48da-bfed-01e6f67004a1)

9. Memasukkan source code pada button upluod
    ![image](https://github.com/user-attachments/assets/a44cf13d-38d2-445c-9048-b9e33dc83489)

10. Membuat method etode showTable mengambil data mata kuliah dari database menggunakan EntityManager
    ![image](https://github.com/user-attachments/assets/02efeb07-d427-45fc-b1bb-faaec1aadd01)

11.	Jalankan program
    ![image](https://github.com/user-attachments/assets/c203cd6d-973a-4d39-a842-b36f6561ac4f)

- Memasukkan data
  ![image](https://github.com/user-attachments/assets/5e45b033-79ae-4064-903a-88a6b841d13d)

- Menghapus data
  ![image](https://github.com/user-attachments/assets/9c6c1f40-29a4-4278-a49e-9d4657c08b9f)

- Upluod data csv
  ![image](https://github.com/user-attachments/assets/605d03d6-849d-4bce-a377-2f188581fb8f)

- Update data
  ![image](https://github.com/user-attachments/assets/ee5cfe5f-8d05-494c-9b78-1526b46d6476)

- Cetak
  ![image](https://github.com/user-attachments/assets/4732b9c9-6fbd-426a-b2a7-6a3830048067)








   
