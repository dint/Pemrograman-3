-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 30 Okt 2015 pada 10.09
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `bengkel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`) VALUES
(1, 'admin', '12345');

-- --------------------------------------------------------

--
-- Struktur dari tabel `isi`
--

CREATE TABLE IF NOT EXISTS `isi` (
  `no_service` varchar(15) NOT NULL,
  `kd_sp` varchar(15) NOT NULL,
  `harga` int(15) NOT NULL,
  `jml_item` int(15) NOT NULL,
  `discount` int(15) NOT NULL,
  `jml_bayar` int(15) NOT NULL,
  PRIMARY KEY (`no_service`,`kd_sp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `isi`
--

INSERT INTO `isi` (`no_service`, `kd_sp`, `harga`, `jml_item`, `discount`, `jml_bayar`) VALUES
('SER001', '1', 45000, 2, 10, 81000),
('SER001', '3', 15000, 5, 10, 67500),
('SER002', '4', 30000, 4, 5, 114000),
('SER004', '2', 25000, 3, 10, 67500),
('SER005', '3', 15000, 2, 10, 27000),
('SER006', '2', 25000, 6, 5, 142500),
('SER008', '2', 25000, 5, 5, 118750);

-- --------------------------------------------------------

--
-- Struktur dari tabel `sparepart`
--

CREATE TABLE IF NOT EXISTS `sparepart` (
  `kd_sp` varchar(15) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `harga` int(15) NOT NULL,
  PRIMARY KEY (`kd_sp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `sparepart`
--

INSERT INTO `sparepart` (`kd_sp`, `nama_barang`, `harga`) VALUES
('1', 'Oli Mesin Shell Advance AX7', 45000),
('2', 'Oli Cooler', 25000),
('3', 'Busi', 15000),
('4', 'Kampas Rem Depan', 30000),
('5', 'Kampas Rem Belang', 35000),
('6', 'Minyak Rem', 6000),
('7', 'Ban Tubelles Zeneos', 350000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
