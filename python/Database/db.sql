DROP DATABASE IF EXISTS Pawmedic;
CREATE DATABASE Pawmedic;

\c Pawmedic;

CREATE TABLE IF NOT EXISTS users (
    id varchar(11) PRIMARY KEY,
    nama varchar(50) not null,
    username varchar(50) not null,
    password varchar(162) not null,
    level varchar(7) not null default 'user',
    telepon varchar(13)
);

CREATE TABLE IF NOT EXISTS dokter (
    id varchar(11) PRIMARY KEY,
    nama varchar(50) not null,
    username varchar(50) not null,
    password varchar(162) not null,
    level varchar(7) not null default 'user',
    telepon varchar(13)
);

CREATE TABLE IF NOT EXISTS obat (
    id varchar(11) PRIMARY KEY,
    nama varchar(11) not null,
    jenis varchar(50) not null,
    harga_jual varchar(50) not null,
    harga_beli varchar(50) not null,
    kategori varchar(50) not null,
    stock varchar(162) not null,
);

CREATE TABLE IF NOT EXISTS penjualan (
    kode varchar(11) PRIMARY KEY,
    jenis varchar(50) not null,
);

CREATE TABLE IF NOT EXISTS pembelian (
    kode varchar(11) PRIMARY KEY,
    tanggal varchar(50) not null,
);

CREATE TABLE IF NOT EXISTS janji_temu (
    id varchar(11) PRIMARY KEY,
    nama varchar(50) not null,
    tanggal date DEFAULT CURRENT_DATE,
    id_user varchar(11) REFERENCES users(id)
    id_user varchar(11) REFERENCES dokter(id)
);

