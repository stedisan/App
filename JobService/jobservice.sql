-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Lug 21, 2017 alle 11:55
-- Versione del server: 10.1.22-MariaDB
-- Versione PHP: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
  `id_cat` int(10) UNSIGNED NOT NULL,
  `nomec` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `preferiti`
--

CREATE TABLE `preferiti` (
  `id_pref` int(10) UNSIGNED NOT NULL,
  `id_utente` int(10) UNSIGNED NOT NULL,
  `id_prof` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `prenotazioni`
--

CREATE TABLE `prenotazioni` (
  `id_prenot` int(10) UNSIGNED NOT NULL,
  `giorno` varchar(10) NOT NULL,
  `ora` varchar(5) NOT NULL,
  `id_utente` int(10) UNSIGNED NOT NULL,
  `id_prof` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `professionisti`
--

CREATE TABLE `professionisti` (
  `id_prof` int(10) UNSIGNED NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cognome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `città` varchar(255) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `id_cat` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `sessions`
--

CREATE TABLE `sessions` (
  `session_id` int(10) UNSIGNED NOT NULL,
  `token` varchar(255) NOT NULL,
  `id_utente` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `tasks`
--

CREATE TABLE `tasks` (
  `task_id` int(10) UNSIGNED NOT NULL,
  `position` int(255) NOT NULL,
  `completed` tinyint(10) NOT NULL,
  `text` varchar(4000) NOT NULL,
  `id_utente` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `utenti`
--

CREATE TABLE `utenti` (
  `id_utente` int(10) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cognome` varchar(255) NOT NULL,
  `età` int(3) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `città` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `datadinascita` varchar(10) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`id_cat`);

--
-- Indici per le tabelle `preferiti`
--
ALTER TABLE `preferiti`
  ADD PRIMARY KEY (`id_pref`),
  ADD KEY `fk3_id_utente` (`id_utente`),
  ADD KEY `fk1_id_prof` (`id_prof`);

--
-- Indici per le tabelle `prenotazioni`
--
ALTER TABLE `prenotazioni`
  ADD PRIMARY KEY (`id_prenot`),
  ADD KEY `fk_id_prof` (`id_prof`),
  ADD KEY `fk1_id_utente` (`id_utente`);

--
-- Indici per le tabelle `professionisti`
--
ALTER TABLE `professionisti`
  ADD PRIMARY KEY (`id_prof`),
  ADD KEY `fk_id_cat` (`id_cat`);

--
-- Indici per le tabelle `sessions`
--
ALTER TABLE `sessions`
  ADD PRIMARY KEY (`session_id`),
  ADD KEY `fk_id_utente` (`id_utente`);

--
-- Indici per le tabelle `tasks`
--
ALTER TABLE `tasks`
  ADD PRIMARY KEY (`task_id`),
  ADD KEY `fk2_id_utente` (`id_utente`);

--
-- Indici per le tabelle `utenti`
--
ALTER TABLE `utenti`
  ADD PRIMARY KEY (`id_utente`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `categorie`
--
ALTER TABLE `categorie`
  MODIFY `id_cat` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `preferiti`
--
ALTER TABLE `preferiti`
  MODIFY `id_pref` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `prenotazioni`
--
ALTER TABLE `prenotazioni`
  MODIFY `id_prenot` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `professionisti`
--
ALTER TABLE `professionisti`
  MODIFY `id_prof` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `sessions`
--
ALTER TABLE `sessions`
  MODIFY `session_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `tasks`
--
ALTER TABLE `tasks`
  MODIFY `task_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT per la tabella `utenti`
--
ALTER TABLE `utenti`
  MODIFY `id_utente` int(10) NOT NULL AUTO_INCREMENT;
--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `preferiti`
--
ALTER TABLE `preferiti`
  ADD CONSTRAINT `fk1_id_prof` FOREIGN KEY (`id_prof`) REFERENCES `preferiti` (`id_pref`),
  ADD CONSTRAINT `fk3_id_utente` FOREIGN KEY (`id_utente`) REFERENCES `preferiti` (`id_pref`);

--
-- Limiti per la tabella `prenotazioni`
--
ALTER TABLE `prenotazioni`
  ADD CONSTRAINT `fk1_id_utente` FOREIGN KEY (`id_utente`) REFERENCES `prenotazioni` (`id_prenot`),
  ADD CONSTRAINT `fk_id_prof` FOREIGN KEY (`id_prof`) REFERENCES `prenotazioni` (`id_prenot`);

--
-- Limiti per la tabella `professionisti`
--
ALTER TABLE `professionisti`
  ADD CONSTRAINT `fk_id_cat` FOREIGN KEY (`id_cat`) REFERENCES `professionisti` (`id_prof`);

--
-- Limiti per la tabella `sessions`
--
ALTER TABLE `sessions`
  ADD CONSTRAINT `fk_id_utente` FOREIGN KEY (`id_utente`) REFERENCES `sessions` (`session_id`);

--
-- Limiti per la tabella `tasks`
--
ALTER TABLE `tasks`
  ADD CONSTRAINT `fk2_id_utente` FOREIGN KEY (`id_utente`) REFERENCES `tasks` (`task_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
