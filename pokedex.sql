-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Värd: localhost:8889
-- Tid vid skapande: 02 feb 2024 kl 15:26
-- Serverversion: 5.7.39
-- PHP-version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Databas: `pokedex`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `favorite`
--

CREATE TABLE `favorite` (
  `id` int(11) NOT NULL,
  `note` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumpning av Data i tabell `favorite`
--

INSERT INTO `favorite` (`id`, `note`) VALUES
(25, 'Pika Pika');

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `favorite`
--
ALTER TABLE `favorite`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
