-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Giu 02, 2017 alle 18:11
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
-- Struttura della tabella `categoria`
--

CREATE TABLE `categoria` (
  `id_cat` char(1) NOT NULL,
  `nomec` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `chat`
--

CREATE TABLE `chat` (
  `id_chat` int(10) NOT NULL,
  `id_profC` char(1) NOT NULL,
  `id_utenteC` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `prenotazione`
--

CREATE TABLE `prenotazione` (
  `id_pren` char(1) NOT NULL,
  `giorno` char(1) DEFAULT NULL,
  `ora` char(1) DEFAULT NULL,
  `id_profp` char(1) NOT NULL,
  `id_utentep` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `professionista`
--

CREATE TABLE `professionista` (
  `id_prof` char(1) NOT NULL,
  `nomep` char(1) DEFAULT NULL,
  `id_cat` char(1) NOT NULL,
  `cognnomep` char(1) DEFAULT NULL,
  `etap` char(1) DEFAULT NULL,
  `telp` int(11) DEFAULT NULL,
  `mailp` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `session`
--

CREATE TABLE `session` (
  `session_id` int(10) NOT NULL,
  `token` varchar(255) NOT NULL,
  `user_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `tasks`
--

CREATE TABLE `tasks` (
  `task_id` char(10) NOT NULL,
  `text` varchar(4000) NOT NULL,
  `completed` tinyint(1) UNSIGNED DEFAULT '0',
  `position` int(10) UNSIGNED NOT NULL,
  `user_id` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `tasks_utente`
--

CREATE TABLE `tasks_utente` (
  `id_task_2` char(10) NOT NULL DEFAULT '',
  `id_utente_2` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

CREATE TABLE `utente` (
  `id_utente` char(1) NOT NULL,
  `nome` char(1) DEFAULT NULL,
  `cognome` char(1) DEFAULT NULL,
  `citta` char(1) DEFAULT NULL,
  `eta` char(1) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `email` char(1) DEFAULT NULL,
  `username` char(1) DEFAULT NULL,
  `password` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_cat`);

--
-- Indici per le tabelle `chat`
--
ALTER TABLE `chat`
  ADD PRIMARY KEY (`id_chat`,`id_profC`,`id_utenteC`),
  ADD KEY `id_profC` (`id_profC`),
  ADD KEY `id_utenteC` (`id_utenteC`);

--
-- Indici per le tabelle `prenotazione`
--
ALTER TABLE `prenotazione`
  ADD PRIMARY KEY (`id_pren`,`id_profp`,`id_utentep`),
  ADD KEY `id_profp` (`id_profp`),
  ADD KEY `id_utentep` (`id_utentep`);

--
-- Indici per le tabelle `professionista`
--
ALTER TABLE `professionista`
  ADD PRIMARY KEY (`id_prof`,`id_cat`),
  ADD KEY `id_cat` (`id_cat`);

--
-- Indici per le tabelle `session`
--
ALTER TABLE `session`
  ADD PRIMARY KEY (`session_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indici per le tabelle `tasks`
--
ALTER TABLE `tasks`
  ADD PRIMARY KEY (`task_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indici per le tabelle `tasks_utente`
--
ALTER TABLE `tasks_utente`
  ADD KEY `id_task_2` (`id_task_2`),
  ADD KEY `id_utente_2` (`id_utente_2`);

--
-- Indici per le tabelle `utente`
--
ALTER TABLE `utente`
  ADD PRIMARY KEY (`id_utente`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `session`
--
ALTER TABLE `session`
  MODIFY `session_id` int(10) NOT NULL AUTO_INCREMENT;
--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `chat`
--
ALTER TABLE `chat`
  ADD CONSTRAINT `chat_ibfk_1` FOREIGN KEY (`id_profC`) REFERENCES `professionista` (`id_prof`),
  ADD CONSTRAINT `chat_ibfk_2` FOREIGN KEY (`id_utenteC`) REFERENCES `utente` (`id_utente`);

--
-- Limiti per la tabella `prenotazione`
--
ALTER TABLE `prenotazione`
  ADD CONSTRAINT `prenotazione_ibfk_1` FOREIGN KEY (`id_profp`) REFERENCES `professionista` (`id_prof`),
  ADD CONSTRAINT `prenotazione_ibfk_2` FOREIGN KEY (`id_utentep`) REFERENCES `utente` (`id_utente`);

--
-- Limiti per la tabella `professionista`
--
ALTER TABLE `professionista`
  ADD CONSTRAINT `professionista_ibfk_1` FOREIGN KEY (`id_cat`) REFERENCES `categoria` (`id_cat`) ON DELETE CASCADE;

--
-- Limiti per la tabella `session`
--
ALTER TABLE `session`
  ADD CONSTRAINT `session_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `utente` (`id_utente`);

--
-- Limiti per la tabella `tasks`
--
ALTER TABLE `tasks`
  ADD CONSTRAINT `tasks_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `utente` (`id_utente`);

--
-- Limiti per la tabella `tasks_utente`
--
ALTER TABLE `tasks_utente`
  ADD CONSTRAINT `tasks_utente_ibfk_1` FOREIGN KEY (`id_task_2`) REFERENCES `tasks` (`task_id`),
  ADD CONSTRAINT `tasks_utente_ibfk_2` FOREIGN KEY (`id_utente_2`) REFERENCES `utente` (`id_utente`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
