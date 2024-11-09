# 📚 Laporan Pratikum Pemrograman Berorientasi Objek

Selamat datang di laporan pratikum **Pemrograman Berorientasi Objek**! 🎉😄

## 📖 Deskripsi

Laporan ini menjelaskan pengembangan aplikasi Java berbasis GUI menggunakan Java Swing dan JPA (Java Persistence API) untuk mengelola data mata kuliah dengan operasi CRUD (Create, Read, Update, Delete). Data mata kuliah yang ditampilkan dalam tabel berisi informasi Kode MK, SKS, Nama Mata Kuliah, dan Semester Ajar, yang disimpan dalam database menggunakan pendekatan persistence.

Aplikasi ini menggunakan `EntityManager` dari JPA untuk menghubungkan data secara langsung dengan database dan menyederhanakan proses pengelolaan data. Pada fungsi tambah, ubah, dan hapus data, sistem secara otomatis memperbarui tabel agar pengguna dapat melihat data terbaru. Selain itu, aplikasi ini mendukung fitur cetak laporan menggunakan JasperReports untuk menghasilkan laporan terstruktur, serta menyediakan tombol upload yang memungkinkan pengguna mengimpor data dari file CSV.💻✨

🔗 Langkah - langkah :

1.	Membuat data menggunakan ms.excel dengan menyesuaikan nama kolom pada table mata kuliah dalam database postgre
