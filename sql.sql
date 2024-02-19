
CREATE TABLE mahasiswa (
    nim CHAR(10) PRIMARY KEY,
    nama VARCHAR(30),
    alamat VARCHAR(200),
    telepon VARCHAR(15),
    jk VARCHAR(10),
    agama VARCHAR(10),
    hobby1 VARCHAR(10),
    hobby2 VARCHAR(10),
    hobby3 VARCHAR(10)
);

CREATE TABLE KRS (
    kode_matkul CHAR(5) PRIMARY KEY,
    nama_matkul VARCHAR(50),
    nilai_matkul INT,
    nim CHAR(10),
    FOREIGN KEY (nim) REFERENCES mahasiswa(nim)
);
