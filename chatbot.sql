-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 16, 2021 at 02:46 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `chatbot`
--

-- --------------------------------------------------------

--
-- Table structure for table `customerState`
--

CREATE TABLE `customerState` (
  `customer_id` int(11) DEFAULT NULL,
  `active_ques` int(11) DEFAULT NULL,
  `active_journey` int(11) DEFAULT NULL,
  `phone_number` mediumtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customerState`
--

INSERT INTO `customerState` (`customer_id`, `active_ques`, `active_journey`, `phone_number`) VALUES
(1, 1, 1, NULL),
(2, 1, 1, '6295836774');

-- --------------------------------------------------------

--
-- Table structure for table `journey_master`
--

CREATE TABLE `journey_master` (
  `journey_id` int(11) NOT NULL,
  `journey_name` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `journey_master`
--

INSERT INTO `journey_master` (`journey_id`, `journey_name`) VALUES
(1, 'Personal Details'),
(2, 'Bank Statement'),
(3, 'Complete KYC'),
(4, 'Setup Smart Repay');

-- --------------------------------------------------------

--
-- Table structure for table `questions_next`
--

CREATE TABLE `questions_next` (
  `question_id` int(11) NOT NULL,
  `question` varchar(255) DEFAULT NULL,
  `journey_id` int(11) DEFAULT NULL,
  `next_ques_id` int(11) DEFAULT NULL,
  `flag` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `questions_next`
--

INSERT INTO `questions_next` (`question_id`, `question`, `journey_id`, `next_ques_id`, `flag`) VALUES
(1, 'First Name', 1, 2, 0),
(2, 'Last Name', 1, 3, 0),
(3, 'Gender', 1, 4, 0),
(4, 'DOB', 1, 5, 0),
(5, 'Mobile Number', 1, 6, 0),
(6, 'Email ID', 1, 7, 0),
(7, 'Employement Type', 1, 8, 0),
(8, 'Monthly Salary', 1, 9, 0),
(9, 'Office Pincode', 1, 10, 0),
(10, 'Current Residential Pincode', 1, 11, 0),
(11, 'PAN Number', 1, 12, 0),
(12, 'Father\'s Name', 1, 13, 0),
(13, 'Mother\'s Name', 1, NULL, NULL),
(14, 'Marital Status', 1, NULL, NULL),
(15, 'Highest Education', 1, NULL, NULL),
(16, 'Institute Name', 1, NULL, NULL),
(17, 'Current Residential Address', 1, NULL, NULL),
(18, 'Total Experience', 1, NULL, NULL),
(19, 'Current Employer\'s Name', NULL, NULL, NULL),
(20, 'Current Designation', NULL, NULL, NULL),
(21, 'Office Address', NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customerState`
--
ALTER TABLE `customerState`
  ADD UNIQUE KEY `phone_number` (`phone_number`) USING HASH;

--
-- Indexes for table `journey_master`
--
ALTER TABLE `journey_master`
  ADD PRIMARY KEY (`journey_id`);

--
-- Indexes for table `questions_next`
--
ALTER TABLE `questions_next`
  ADD PRIMARY KEY (`question_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `journey_master`
--
ALTER TABLE `journey_master`
  MODIFY `journey_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `questions_next`
--
ALTER TABLE `questions_next`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
