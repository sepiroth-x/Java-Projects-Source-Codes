-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 08, 2024 at 08:54 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

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
-- Table structure for table `tools`
--

CREATE TABLE `tools` (
  `id` int(11) NOT NULL,
  `toolname` varchar(32) NOT NULL,
  `tool_category` varchar(32) NOT NULL,
  `description` text NOT NULL,
  `qty_in_stock` int(18) NOT NULL,
  `status` varchar(16) NOT NULL,
  `date_purchased` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tools`
--

INSERT INTO `tools` (`id`, `toolname`, `tool_category`, `description`, `qty_in_stock`, `status`, `date_purchased`) VALUES
(1, 'Tool Sample 1', 'Networking', 'Tool sample description only', 10, 'In-Stock', '2023-10-09'),
(2, 'Tool Sample 2', 'Networking', 'Tool sample description only', 10, 'In-Stock', '2023-10-09'),
(3, 'Tool Sample 3', 'Networking', 'Tool sample description only', 10, 'In-Stock', '2023-10-09'),
(4, 'Tool Sample 4', 'Networking', 'Tool sample description only', 10, 'In-Stock', '2023-10-09'),
(5, 'Tool Sample 5', 'Networking', 'Tool sample description only', 10, 'In-Stock', '2023-10-09'),
(6, 'Tool Sample 6', 'Networking', 'Tool sample description only', 10, 'In-Stock', '2023-10-09'),
(7, 'Tool Sample 7', 'Networking', 'Tool sample description only', 10, 'In-Stock', '2023-10-09');

-- --------------------------------------------------------

--
-- Table structure for table `tools_log`
--

CREATE TABLE `tools_log` (
  `id` int(11) NOT NULL,
  `date_of_record` date NOT NULL,
  `qty_borrowed` int(16) NOT NULL,
  `borrower_name` varchar(32) NOT NULL,
  `qty_in_stock` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  `major` varchar(16) NOT NULL,
  `img_filename` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstname`, `lastname`, `school_id`, `section`, `yearLevel`, `status`, `course`, `major`, `img_filename`) VALUES
(6, 'Richard', 'Cupal', '10-2-00000', 'NA', 'NA', 'Active', 'BS Industrial Te', 'Computer Technol', 'me.jpg'),
(7, 'Syrael', 'Soque', '10-2-00001', 'NA', 'NA', 'Active', 'Mechanical Engin', 'Mechanical Engin', 'syrael.jpg'),
(8, 'Clarissa', 'Cañete', '10-2-00002', 'NA', 'NA', 'Active', 'BS Industrial Te', 'Computer Technol', ''),
(9, 'Jonny', 'Enopia', '10-2-00003', 'Affable', '4th', 'Active', 'BS Industrial Te', 'Computer Technol', ''),
(10, 'Vladimir', 'Tedor', '10-2-00004', 'Brilliant', '4th', 'Active', 'BS Industrial Te', 'Computer Technol', ''),
(11, 'Girrah', 'Remollo', '10-2-00005', 'Faithful', '4th', 'Active', 'BS Industrial Te', 'Computer Technol', 'girrah.jpg'),
(12, 'Richard', 'Gomez', '10-2-00006', 'NA', 'NA', 'Inactive', 'NA', 'NA', ''),
(14, 'Charmyboi', 'Labajo', '10-2-00007', 'Faculty', 'NA', 'Part-Time', '', '', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tools`
--
ALTER TABLE `tools`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tools_log`
--
ALTER TABLE `tools_log`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tools`
--
ALTER TABLE `tools`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tools_log`
--
ALTER TABLE `tools_log`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
