# Aplikasi Perpustakaan

Aplikasi Perpustakaan adalah program sederhana berbasis Java yang memungkinkan pengguna untuk mengelola data buku di perpustakaan. Program ini menyediakan fitur CRUD (Create, Read, Update, Delete) untuk buku, seperti menambah buku baru, menampilkan daftar buku, mencari buku berdasarkan judul, dan menghapus buku dari koleksi.

## Struktur Proyek
Proyek ini memiliki struktur sebagai berikut:

AplikasiPerpustakaan/ 

│ ├── src/

│ ├── aplikasi/ │ 

│ └── AplikasiPerpustakaan.java │ 

│ │ └── model/ │ 

├── Buku.java 

│ └── Perpustakaan.java 

│ └── README.md

## Persyaratan
- **JDK**: Program ini ditulis menggunakan Java SE 8 atau lebih baru. Pastikan Anda memiliki JDK yang terinstal di komputer Anda.

## Fitur Aplikasi
Aplikasi ini memiliki fitur-fitur berikut:

1. **Tambah Buku**: Menambahkan data buku baru ke perpustakaan.
2. **Tampilkan Semua Buku**: Menampilkan daftar semua buku yang tersedia di perpustakaan.
3. **Cari Buku**: Mencari buku berdasarkan judul.
4. **Hapus Buku**: Menghapus buku dari perpustakaan berdasarkan judul.
5. **Keluar**: Menghentikan program.

## Penjelasan Setiap Class
### 1. Class `Buku`
File: `model/Buku.java`

Class `Buku` merepresentasikan objek buku dengan tiga properti berikut:
- `judul`: Judul buku (String)
- `penulis`: Nama penulis buku (String)
- `penerbit`: Nama penerbit buku (String)

#### Metode:
- `Buku(String judul, String penulis, String penerbit)`: Konstruktor untuk membuat objek buku baru.
- `tampilkanInformasi()`: Menampilkan informasi buku.

### 2. Class `Perpustakaan`
File: `model/Perpustakaan.java`

Class `Perpustakaan` berfungsi sebagai pengelola koleksi buku di perpustakaan. Class ini menggunakan `ArrayList` untuk menyimpan objek buku.

#### Metode:
- `tambahBuku(Buku buku)`: Menambahkan buku ke koleksi.
- `tampilkanSemuaBuku()`: Menampilkan semua buku dalam koleksi.
- `hapusBuku(String judul)`: Menghapus buku dari koleksi berdasarkan judul.
- `cariBuku(String judul)`: Mencari dan menampilkan buku berdasarkan judul.

### 3. Class `AplikasiPerpustakaan`
File: `aplikasi/AplikasiPerpustakaan.java`

Class ini adalah main class yang berfungsi sebagai antarmuka pengguna (User Interface) untuk berinteraksi dengan aplikasi. Program ini menampilkan menu dan menerima input pengguna untuk menjalankan berbagai fungsi perpustakaan.

### Alur Program
1. Program menampilkan menu utama dengan 5 opsi: Tambah Buku, Tampilkan Semua Buku, Cari Buku, Hapus Buku, dan Keluar.
2. Pengguna memilih salah satu opsi:
   - Opsi 1: Menambahkan buku baru.
   - Opsi 2: Menampilkan semua buku.
   - Opsi 3: Mencari buku berdasarkan judul.
   - Opsi 4: Menghapus buku berdasarkan judul.
   - Opsi 5: Keluar dari program.
3. Program akan terus menampilkan menu sampai pengguna memilih opsi "Keluar".

## Cara Menggunakan Program
1. **Clone repository** atau unduh proyek ini ke dalam komputer Anda.
2. Buka terminal atau Command Prompt, dan arahkan ke folder proyek ini.
3. Jalankan perintah berikut untuk mengkompilasi semua file Java:
   ```bash
   javac -d bin src/aplikasi/AplikasiPerpustakaan.java src/model/Buku.java src/model/Perpustakaan.java

## perintah menjalankan program
java -cp bin aplikasi.AplikasiPerpustakaan

## Output Program
=== Aplikasi Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 1

Masukkan judul buku: Pemrograman Java

Masukkan nama penulis: Anton

Masukkan penerbit: Penerbit ABC

Buku berhasil ditambahkan!

=== Aplikasi Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 2

Daftar Buku di Perpustakaan:

Judul Buku   : Pemrograman Java

Penulis      : Anton

Penerbit     : Penerbit ABC

Jika daftar buku kosong maka output:

Belum ada buku di perpustakaan.

=== Aplikasi Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 3

Masukkan judul buku yang ingin dicari: Pemrograman Java

Buku ditemukan:
Judul Buku   : Pemrograman Java

Penulis      : Anton

Penerbit     : Penerbit ABC

jika buku tidak ada maka output:

Buku dengan judul "Pemrograman Java" tidak ditemukan.

=== Aplikasi Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 4

Masukkan judul buku yang ingin dihapus: Pemrograman Java

Buku dengan judul "Pemrograman Java" berhasil dihapus.

Jika buku tidak ada maka output:

Buku dengan judul "Pemrograman Java" tidak ditemukan.

=== Aplikasi Perpustakaan ===
1. Tambah Buku
2. Tampilkan Semua Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
Pilih menu: 5

Terima kasih telah menggunakan aplikasi perpustakaan.

-------------------------
