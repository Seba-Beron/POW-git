CREATE TABLE `usuarios` (
  `id` int NOT NULL,
  `email` varchar(30) NOT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `usuarios` (`id`, `email`, `pass`) VALUES
(1, 'admin.com', 'admin');