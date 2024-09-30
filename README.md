# Aplikasi Perpustakaan

Aplikasi Perpustakaan adalah program sederhana berbasis Java yang memungkinkan pengguna untuk mengelola data buku di perpustakaan. Program ini menyediakan fitur CRUD (Create, Read, Update, Delete) untuk buku, seperti menambah buku baru, menampilkan daftar buku, mencari buku berdasarkan judul, dan menghapus buku dari koleksi.

## Struktur Proyek
Proyek ini memiliki struktur sebagai berikut:

AplikasiPerpustakaan/ 

│ ├── src/

│ ├── com.mycompany.aplikasiperpustakaan/ │ 

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


## Penjelasan Program
### Class `Buku`
File: `model/Buku.java`

Class `Buku` merepresentasikan setiap objek buku yang memiliki tiga properti:
- `judul` (String): Menyimpan judul buku.
- `penulis` (String): Menyimpan nama penulis buku.
- `penerbit` (String): Menyimpan nama penerbit buku.

### Konstruktor dan Metode:
- **Konstruktor** `Buku(String judul, String penulis, String penerbit)`: 
  Digunakan untuk menginisialisasi objek buku baru dengan judul, penulis, dan penerbit.
  
- **Metode** `tampilkanInformasi()`: 
  Metode ini menampilkan detail dari objek buku ke konsol.

### Class `Perpustakaan`
File: `model/Perpustakaan.java`

Class `Perpustakaan` berfungsi sebagai pengelola koleksi buku di perpustakaan. Menggunakan `ArrayList` untuk menyimpan objek buku.

#### Properti:
- `static ArrayList<Buku> koleksiBuku`: 
  Variabel `koleksiBuku` bertipe `ArrayList<Buku>` digunakan untuk menyimpan daftar buku di perpustakaan. Kata kunci `static` digunakan sehingga `koleksiBuku` dapat diakses tanpa membuat objek `Perpustakaan`.

#### Metode:
- `tambahBuku(Buku buku)`: Menambahkan buku baru ke dalam `koleksiBuku`.
- `tampilkanSemuaBuku()`: Menampilkan semua buku yang ada di `koleksiBuku` menggunakan perulangan `for-each`.
- `hapusBuku(String judul)`: Menghapus buku berdasarkan judul dengan mencari buku menggunakan perulangan `for-each`.
- `cariBuku(String judul)`: Mencari buku berdasarkan judul dengan menggunakan perulangan `for-each`.

### Class `AplikasiPerpustakaan`
File: `aplikasi/AplikasiPerpustakaan.java`

Class `AplikasiPerpustakaan` adalah entry point (main class) program yang menyediakan antarmuka menu kepada pengguna untuk mengelola koleksi buku.

#### Fitur Program:
- Program ini menggunakan perulangan `do-while` untuk menampilkan menu dan terus meminta input hingga pengguna memilih opsi "Keluar".
- Menggunakan percabangan `switch` untuk menentukan tindakan berdasarkan input pengguna.

#### Tipe Data yang Digunakan:
- `String`: Digunakan untuk menyimpan informasi seperti judul, penulis, dan penerbit.
- `int`: Digunakan untuk menyimpan pilihan menu dari pengguna.
- `ArrayList<Buku>`: Digunakan untuk menyimpan daftar objek buku.

### Penjelasan Tipe Data dan Struktur Data:
- `String`: Digunakan untuk menyimpan teks seperti nama penulis, judul buku, dan nama penerbit.
- `ArrayList`: Struktur data yang digunakan untuk menyimpan daftar buku. `ArrayList` memungkinkan pengelolaan koleksi data buku dengan mudah, seperti menambah, menghapus, dan mencari data.

### Percabangan (Conditional Statement)
- `switch (pilihan)`: Digunakan untuk menentukan tindakan yang akan dilakukan berdasarkan pilihan pengguna dari menu utama. Setiap case pada `switch` menangani satu opsi menu.

### Perulangan (Looping)
- **Perulangan `for-each`**: Digunakan untuk iterasi pada koleksi `ArrayList<Buku>` ketika menampilkan semua buku (`tampilkanSemuaBuku`), mencari buku (`cariBuku`), dan menghapus buku (`hapusBuku`).

### Kata Kunci `static`
- `ArrayList<Buku> koleksiBuku`: Dideklarasikan sebagai `static`, sehingga dapat diakses oleh metode `static` lain dalam class `Perpustakaan` tanpa perlu membuat objek `Perpustakaan`.
  
### Penggunaan Input/Output
- **Input**: Program menggunakan `Scanner` untuk menerima input dari pengguna.
- **Output**: Program menampilkan hasil operasi ke konsol menggunakan `System.out.println()`.

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

##perintah menjalankan program
Jalankan dengan perintah berikut:
```bash
   java -cp bin com.mycompany.aplikasiperpustakaan.AplikasiPerpustakaan
```

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
