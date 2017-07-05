-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 17, 2017 alle 13:21
-- Versione del server: 10.1.21-MariaDB
-- Versione PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jobservice`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `categorie`
--

CREATE TABLE `categorie` (
  `id_cat` int(10) NOT NULL AUTO_INCREMENT,
  `nomec` varchar(255) NOT NULL,
  PRIMARY KEY (`id_cat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

-- --------------------------------------------------------


-- --------------------------------------------------------

--
-- Struttura della tabella `prenotazioni`
--

CREATE TABLE `prenotazioni` (
  `id_pren` int(10) NOT NULL AUTO_INCREMENT,
  `giorno` date (255) NOT NULL,
  `ora` int(255) NOT NULL,
  `id_prof` int(10),
  `id_utente` int(10) NOT NULL,
 PRIMARY KEY (`id_pren`),
 FOREIGN KEY (`id_prof`) REFERENCES `professionisti` (`id_prof`),
 FOREIGN KEY (`id_utente`)REFERENCES `utenti` (`id_utente`)
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

-- --------------------------------------------------------

--
-- Struttura della tabella `professionisti`
--

CREATE TABLE `professionisti` (
  `id_prof` int(10) NOT NULL AUTO_INCREMENT,
  `nomep` varchar(255) NOT NULL,
  `id_cat` int(10) NOT NULL,
  `cognnomep` varchar(255) NOT NULL,
  `etap` varchar(3) NOT NULL,
  `telp` varchar(11) NOT NULL,
  `città` varchar(11) NOT NULL,
  `mailp` varchar(1) NOT NULL,
  PRIMARY KEY (`id_prof`),
  FOREIGN KEY (`id_cat`) REFERENCES `categorie` (`id_cat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

-- --------------------------------------------------------

--
-- Struttura della tabella `utenti`
--

CREATE TABLE `utenti` (
  `id_utente` int(10) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cognome` varchar(255) NOT NULL,
  `citta` varchar(255) NOT NULL,
  `eta` varchar(3) NOT NULL,
  `telefono` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id_utente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

--
-- Struttura della tabella `tasks`
--

CREATE TABLE `tasks` (
  `task_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(4000) NOT NULL,
  `completed` tinyint(1) unsigned NULL DEFAULT '0',
  `position` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`task_id`),
  KEY `fk_tasks_users_idx` (`id_utente`),
  CONSTRAINT `fk_tasks_constraint` FOREIGN KEY (`id_utente`) REFERENCES `utenti` (`id_utente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;

--
-- Struttura della tabella `sessions`
--

CREATE TABLE `sessions` (
  `session_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `token` varchar(255) NOT NULL,
  `id_utente` int(10) unsigned NOT NULL,
  PRIMARY KEY (`session_id`),
  KEY `fk_sessions_users_idx` (`user_id`),
  CONSTRAINT `fk_sessions_constraint` FOREIGN KEY (`id_utente`) REFERENCES `utenti` (`id_utente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;




/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
