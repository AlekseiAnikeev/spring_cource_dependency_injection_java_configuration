![SPRING](https://spring.io/images/spring-logo-2022-dark-2f10e8055653ec50e693eb444291d742.svg)

# Внедрение зависимостей с помощью Java конфигурации

## Описание
Начало знакомства со Spring, замена XML конфигурации на java.
1. Изменить MusicPlayer(прошлый проект) так, чтобы он хранил в себе список жанров
2. Изменить конструктор MusicPlayer в соответствии с предыдущим условием
3. Создать бины в конфигурационном java классе
4. Внедрить bean из списка в MusicPlayer
5. В классе MusicPlayer изменить метод playMusic() так, чтобы он восспроизводил песню из случайного жанра
6. Аннотации @ComponentScan, @Component, @Autowride исспользовать запрещено.
### Внедрение зависимости в класс MusicPlayer при помощи:
- Внешний файл + @Value - поле "volume".
- Внешний файл + @Value - поле "name".
### Внедрение списка
- List<Music> musicList.

## Установка 
1. Клонировать репозиторий.
2. Пользоватся :P

## Реализовано:

- Создание зависимостей через java конфигурацию
- Добавлен файл для присваивания значений с помощи "ключ-значения"
- Добавлен класс Computer который зависит от MusicPlayer
- Computer выводит на экран название трека из случайного жанра.

