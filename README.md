# Implementasi CRUD Menggunakan Java Persistence API (JPA) dengan Relasi Antar Tabel
Pada praktikum ke 12 ini merupakan implementasi CRUD berbasis Java menggunakan Java Persistence API (JPA) untuk mengelola data secara persisten dengan konsep Object Relational Mapping (ORM). Aplikasi ini menerapkan relasi antar tabel, seperti hubungan One-to-One, One-to-Many, Many-to-One, dan Many-to-Many, sehingga pengguna dapat menambah, menampilkan, mengubah, dan menghapus data yang saling terhubung melalui antarmuka Java Swing. Dengan memanfaatkan Entity dan EntityManager, proses pengolahan data menjadi lebih terstruktur tanpa penulisan query SQL manual, serta mendukung pengelolaan relasi data secara efektif di dalam database.

# 1. Java Persistence API (JPA)
Java Persistence API (JPA) adalah spesifikasi Java yang digunakan untuk mengelola data dengan pendekatan Object Relational Mapping (ORM), sehingga proses pengolahan data dapat dilakukan melalui objek Java tanpa harus menulis query SQL secara langsung. JPA memisahkan logika aplikasi dari logika database, membuat pengembangan lebih terstruktur, bersih, dan efisien dalam mengelola entity dan data secara persisten. Dalam praktikum ini, JPA digunakan untuk menghubungkan aplikasi Java dengan database guna mempermudah proses CRUD secara otomatis dan konsisten. <br>
Fungsi utama JPA : <br>
- Mengelola siklus hidup objek-data (entity lifecycle) <br>
- Menyediakan mekanisme transaksi database <br>
- Mendukung query tingkat tinggi melalui JPQL <br>
- Memfasilitasi pemetaan objek ke tabel database

# 2. Object Relational Mapping (ORM)
Object Relational Mapping (ORM) adalah teknik yang memetakan objek dalam pemrograman berorientasi objek ke tabel dalam database relasional, sehingga developer dapat mengelola data menggunakan objek tanpa menulis SQL secara langsung. ORM membantu menyederhanakan proses pengolahan data, meningkatkan keamanan, mempercepat pengembangan, serta mempermudah pemeliharaan aplikasi. Dalam konteks JPA, ORM digunakan untuk mempermudah integrasi antara aplikasi dan database secara efisien dan terstruktur.

# 3. Relasi Antar Tabel dalam JPA
Relasi antar tabel adalah hubungan logis antara dua atau lebih tabel dalam database. JPA menyediakan anotasi untuk mengatur hubungan antar entity, sehingga bisa menggambarkan struktur relasional database ke dalam bentuk objek. <br>
Jenis relasi yang didukung JPA : <br>
- One-to-One : Satu data terkait satu data lain <br>
-	One-to-Many : Satu entitas memiliki banyak entitas lain <br>
-	Many-to-One : Banyak entitas terkait satu entitas induk <br>
-	Many-to-Many : Hubungan banyak ke banyak


