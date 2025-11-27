-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Servidor: database:3306
-- Tiempo de generación: 10-11-2025 a las 11:28:03
-- Versión del servidor: 8.4.5
-- Versión de PHP: 8.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `persutildb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `blog`
--

CREATE TABLE `blog` (
  `id` bigint NOT NULL,
  `titulo` varchar(1024) COLLATE utf32_unicode_ci NOT NULL,
  `contenido` longtext COLLATE utf32_unicode_ci NOT NULL,
  `etiquetas` varchar(1024) COLLATE utf32_unicode_ci NOT NULL,
  `fecha_creacion` datetime NOT NULL,
  `fecha_modificacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `blog`
--
ALTER TABLE `blog`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `blog`
--
ALTER TABLE `blog`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

--
-- Estructura de tabla para la tabla `gallery_image`
--

CREATE TABLE `gallery_image` (
  `id` bigint NOT NULL,
  `titulo` varchar(1024) CHARACTER SET utf32 COLLATE utf32_unicode_ci NOT NULL,
  `descripcion` longtext CHARACTER SET utf32 COLLATE utf32_unicode_ci NOT NULL,
  `url_imagen` varchar(2048) CHARACTER SET utf32 COLLATE utf32_unicode_ci NOT NULL,
  `publicado` tinyint(1) NOT NULL DEFAULT '0',
  `fecha_creacion` datetime NOT NULL,
  `fecha_modificacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Volcado de datos para la tabla `gallery_image`
--

INSERT INTO `gallery_image` (`id`, `titulo`, `descripcion`, `url_imagen`, `publicado`, `fecha_creacion`, `fecha_modificacion`) VALUES
(126, 'Atardecer en la montaña', 'Composición minimalista.', 'https://cdn.pixabay.com/photo/2015/04/23/22/01/mountains-736886_1280.jpg', 0, '2025-11-25 10:07:35', NULL),
(127, 'Noche estrellada', 'Perspectiva aérea.', 'https://cdn.pixabay.com/photo/2020/09/19/19/37/landscape-5585247_1280.jpg', 1, '2025-11-25 10:07:35', NULL),
(128, 'Valle verde', 'Contraste entre luz y sombra.', 'https://cdn.pixabay.com/photo/2018/04/26/12/14/travel-3351825_1280.jpg', 0, '2025-11-25 10:07:35', NULL),
(129, 'Sendero solitario', 'Detalle de la flora local.', 'https://cdn.pixabay.com/photo/2024/04/08/11/42/doggy-8683291_1280.jpg', 1, '2025-11-25 10:07:35', NULL),
(130, 'Sendero solitario', 'Lugar aislado, poca luz.', 'https://cdn.pixabay.com/photo/2013/03/01/18/40/crispus-87928_1280.jpg', 1, '2025-11-25 10:07:35', NULL),
(131, 'Río cristalino', 'Texturas y contrastes.', 'https://cdn.pixabay.com/photo/2020/03/31/10/48/park-4987155_1280.jpg', 0, '2025-11-25 10:07:35', NULL),
(132, 'Luz entre árboles', 'Efecto de luz natural.', 'https://cdn.pixabay.com/photo/2018/04/26/12/14/travel-3351825_1280.jpg', 0, '2025-11-25 10:07:36', NULL),
(133, 'Cascada escondida', 'Ambiente sereno y pacífico.', 'https://cdn.pixabay.com/photo/2013/03/01/18/40/crispus-87928_1280.jpg', 1, '2025-11-25 10:25:54', NULL),
(134, 'Paisaje otoñal', 'Escena capturada al amanecer.', 'https://cdn.pixabay.com/photo/2020/09/19/19/37/landscape-5585247_1280.jpg', 1, '2025-11-25 10:25:54', NULL),
(135, 'Atardecer en la montaña', 'Imagen tomada en primavera.', 'https://cdn.pixabay.com/photo/2013/02/01/18/14/url-77169_1280.jpg', 0, '2025-11-25 10:25:54', NULL),
(136, 'Sendero solitario', 'Efecto de luz natural.', 'https://cdn.pixabay.com/photo/2018/04/26/16/39/beach-3352363_1280.jpg', 0, '2025-11-25 10:25:54', NULL),
(137, 'Vista panorámica', 'Texturas y contrastes.', 'https://cdn.pixabay.com/photo/2018/05/18/12/43/rose-3411110_1280.jpg', 0, '2025-11-25 10:25:54', NULL),
(138, 'Luz entre árboles', 'Lugar aislado, poca luz.', 'https://cdn.pixabay.com/photo/2020/09/19/19/37/landscape-5585247_1280.jpg', 0, '2025-11-25 10:33:42', NULL),
(139, 'Flores silvestres', 'Imagen tomada en primavera.', 'https://cdn.pixabay.com/photo/2020/09/19/19/37/landscape-5585247_1280.jpg', 1, '2025-11-25 10:33:43', NULL),
(140, 'Noche estrellada', 'Paisaje natural sin retoques.', 'https://cdn.pixabay.com/photo/2021/03/12/08/51/shorturl-6089108_1280.jpg', 0, '2025-11-25 10:33:43', NULL),
(141, 'Bruma matutina', 'Composición minimalista.', 'https://cdn.pixabay.com/photo/2015/04/23/22/01/mountains-736886_1280.jpg', 1, '2025-11-25 10:33:43', NULL),
(142, 'Atardecer en la montaña', 'Imagen tomada en primavera.', 'https://cdn.pixabay.com/photo/2018/02/09/16/33/hanger-3141936_1280.jpg', 0, '2025-11-25 10:33:43', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `gallery_image`
--
ALTER TABLE `gallery_image`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de la tabla `gallery_image`
--
ALTER TABLE `gallery_image`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=143;
COMMIT;
