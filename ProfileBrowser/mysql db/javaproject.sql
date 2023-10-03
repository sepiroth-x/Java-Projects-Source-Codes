-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 03, 2023 at 02:51 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `firstname` varchar(16) NOT NULL,
  `lastname` varchar(16) NOT NULL,
  `school_id` varchar(32) NOT NULL,
  `section` varchar(16) NOT NULL,
  `yearLevel` varchar(16) NOT NULL,
  `status` varchar(16) NOT NULL,
  `course` varchar(16) NOT NULL,
  `major` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstname`, `lastname`, `school_id`, `section`, `yearLevel`, `status`, `course`, `major`) VALUES
(6, 'Richard', 'Cupal', '10-2-00000', 'NA', 'NA', 'Active', 'BS Industrial Te', 'Computer Technol'),
(7, 'Syrael', 'Soque', '10-2-00001', 'NA', 'NA', 'Active', 'Mechanical Engin', 'Mechanical Engin'),
(8, 'Clarissa', 'Cañete', '10-2-00002', 'NA', 'NA', 'Active', 'BS Industrial Te', 'Computer Technol'),
(9, 'Jonny', 'Enopia', '10-2-00003', 'Affable', '4th', 'Active', 'BS Industrial Te', 'Computer Technol'),
(10, 'Vladimir', 'Tedor', '10-2-00004', 'Brilliant', '4th', 'Active', 'BS Industrial Te', 'Computer Technol'),
(11, 'Girrah', 'Remollo', '10-2-00005', 'Faithful', '4th', 'Active', 'BS Industrial Te', 'Computer Technol'),
(12, 'Richard', 'Gomez', '10-2-00006', 'NA', 'NA', 'Inactive', 'NA', 'NA');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
