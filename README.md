# Praktikum Algoritma dan Pemrograman

Kumpulan kode latihan, tugas, dan laporan praktikum **Algoritma dan Pemrograman** menggunakan bahasa **Java**. Materi disusun per pekan, mulai dari output sederhana, variabel, operator, percabangan, dan perulangan hingga penggunaan class serta antarmuka desktop dengan Swing.

| Identitas | Keterangan |
| --- | --- |
| Nama | Habibi Putra Rizqullah |
| NIM | 2411531001 |
| Mata Kuliah | Algoritma dan Pemrograman |
| Repository | [2024_1_alpro_2411531001](https://github.com/habibiputrar/2024_1_alpro_2411531001) |

## Daftar Materi

Seluruh kode berada di `prakalpro_1_2411531001/src/` dan dikelompokkan dalam package `pekan1` sampai `pekan8`.

| Pekan | Materi | Contoh Implementasi | Folder |
| --- | --- | --- | --- |
| 1 | Pengenalan program Java dan output | Hello World, escape character, serta menggambar pola melalui method | [pekan1](prakalpro_1_2411531001/src/pekan1/) |
| 2 | Variabel, ekspresi, dan string | Operasi bilangan, penggabungan string, serta perhitungan subtotal, pajak, dan tip | [pekan2](prakalpro_1_2411531001/src/pekan2/) |
| 3 | Operator dan input pengguna | Operator aritmatika, assignment, logika, dan relasional dengan input melalui Scanner | [pekan3](prakalpro_1_2411531001/src/pekan3/) |
| 4 | Percabangan | Kondisi `if`, `if-else`, dan beberapa kondisi untuk mengolah IPK, umur, SIM, serta nilai | [pekan4](prakalpro_1_2411531001/src/pekan4/) |
| 5 | Perulangan `for` | Deret bilangan, penjumlahan, nested loop, dan pencetakan pola | [pekan5](prakalpro_1_2411531001/src/pekan5/) |
| 6 | Perulangan `while` dan `do-while` | Sentinel loop, pengulangan berdasarkan input, simulasi lempar dadu, dan permainan penjumlahan | [pekan6](prakalpro_1_2411531001/src/pekan6/) |
| 7 | Class, object, dan latihan aplikasi | Data mahasiswa dengan getter/setter, pilihan pemilu berbasis konsol, dan GUI aritmatika | [pekan7](prakalpro_1_2411531001/src/pekan7/) |
| 8 | Antarmuka desktop dengan Swing | Form Pilkada dan kalkulator dengan penanganan event tombol | [pekan8](prakalpro_1_2411531001/src/pekan8/) |

## Struktur Repository

```text
.
├── prakalpro_1_2411531001/
│   ├── .classpath
│   ├── .settings/
│   └── src/
│       ├── module-info.java
│       ├── pekan1/
│       ├── pekan2/
│       ├── pekan3/
│       ├── pekan4/
│       ├── pekan5/
│       ├── pekan6/
│       ├── pekan7/
│       └── pekan8/
└── README.md
```

Folder setiap pekan memuat kode `.java`. Laporan praktikum berbentuk PDF tersedia di folder pekan 1 sampai 7.

## Persiapan

- **Java Development Kit (JDK)** untuk menjalankan perintah `javac` dan `java`.
- **Git** untuk mengunduh repository.
- Terminal atau IDE Java untuk membuka dan menjalankan kode.
- Lingkungan desktop untuk program yang menggunakan Swing.

Proyek menyertakan `module-info.java` yang mendeklarasikan modul `java.desktop`. Jika menggunakan konfigurasi modul tersebut, gunakan JDK yang mendukung sistem modul Java (Java 9 atau lebih baru).

Periksa ketersediaan Java pada terminal:

```bash
java -version
javac -version
```

Unduh repository dan masuk ke folder proyek Java:

```bash
git clone https://github.com/habibiputrar/2024_1_alpro_2411531001.git
cd 2024_1_alpro_2411531001/prakalpro_1_2411531001
```

## Menjalankan Program

Setiap latihan dijalankan melalui class yang memiliki method `main`. Perintah berikut dijalankan dari folder `prakalpro_1_2411531001/`.

Contoh kompilasi dan eksekusi program Hello World:

```bash
javac -encoding UTF-8 -d out -sourcepath src src/pekan1/HelloWorld.java
java -cp out pekan1.HelloWorld
```

Opsi `-d out` menyimpan hasil kompilasi ke folder `out`, sedangkan `-sourcepath src` membantu compiler menemukan class lain yang dibutuhkan. Saat menjalankan program, gunakan nama package dan class, tanpa akhiran `.java`.

Untuk latihan lain, ganti path sumber dan nama class sesuai tabel berikut. Perhatikan huruf besar dan kecil pada nama file serta class.

| Pekan | Contoh File Sumber | Class untuk Dijalankan |
| --- | --- | --- |
| 1 | [src/pekan1/HelloWorld.java](prakalpro_1_2411531001/src/pekan1/HelloWorld.java) | `pekan1.HelloWorld` |
| 2 | [src/pekan2/Receipt1.java](prakalpro_1_2411531001/src/pekan2/Receipt1.java) | `pekan2.Receipt1` |
| 3 | [src/pekan3/OperatorAritmatika.java](prakalpro_1_2411531001/src/pekan3/OperatorAritmatika.java) | `pekan3.OperatorAritmatika` |
| 4 | [src/pekan4/Nilai.java](prakalpro_1_2411531001/src/pekan4/Nilai.java) | `pekan4.Nilai` |
| 5 | [src/pekan5/PerulanganFor1.java](prakalpro_1_2411531001/src/pekan5/PerulanganFor1.java) | `pekan5.PerulanganFor1` |
| 6 | [src/pekan6/SentinelLoop.java](prakalpro_1_2411531001/src/pekan6/SentinelLoop.java) | `pekan6.SentinelLoop` |
| 7 | [src/pekan7/PanggilMahasiswa2.java](prakalpro_1_2411531001/src/pekan7/PanggilMahasiswa2.java) | `pekan7.PanggilMahasiswa2` |
| 8 | [src/pekan8/TugasKalkulatorPekan8.java](prakalpro_1_2411531001/src/pekan8/TugasKalkulatorPekan8.java) | `pekan8.TugasKalkulatorPekan8` |

Program yang memakai `Scanner` menerima input melalui terminal. Program Swing membuka jendela aplikasi dan memerlukan lingkungan desktop.

Class `Mahasiswa` pada pekan 7 digunakan oleh `PanggilMahasiswa` dan `PanggilMahasiswa2`; jalankan salah satu class pemanggil tersebut untuk mencoba latihan datanya.

## Laporan Praktikum

| Pekan | Laporan |
| --- | --- |
| 1 | [Laporan Pekan 1](prakalpro_1_2411531001/src/pekan1/LAPORAN%20PRATIKUM%20ALGORITMA%20PEMROGRAMAN%20Pekan%201.pdf) |
| 2 | [Laporan Pekan 2](prakalpro_1_2411531001/src/pekan2/LAPORAN%20PRATIKUM%20ALGORITMA%20PEMROGRAMAN%20Pekan%202.pdf) |
| 3 | [Laporan Pekan 3](prakalpro_1_2411531001/src/pekan3/LAPORAN%20PRATIKUM%20ALGORITMA%20PEMROGRAMAN%20PEKAN%203.pdf) |
| 4 | [Laporan Pekan 4](prakalpro_1_2411531001/src/pekan4/LAPORAN%20PRATIKUM%20ALGORITMA%20PEMROGRAMAN%20pekan%204.pdf) |
| 5 | [Laporan Pekan 5](prakalpro_1_2411531001/src/pekan5/LAPORAN%20PRATIKUM%20ALGORITMA%20PEMROGRAMAN%20pekan%205.pdf) |
| 6 | [Laporan Pekan 6](prakalpro_1_2411531001/src/pekan6/LAPORAN%20PRATIKUM%20ALGORITMA%20PEMROGRAMAN%20pekan%206.pdf) |
| 7 | [Laporan Pekan 7](prakalpro_1_2411531001/src/pekan7/LAPORAN%20PRATIKUM%20ALGORITMA%20PEMROGRAMAN%20pekan%207.pdf) |
