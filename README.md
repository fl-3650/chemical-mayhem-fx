# Chemical Mayhem FX

**Общее описание проекта**:
Chemical Mayhem FX - это инновационное приложение, облегчающее изучение химии с помощью интерактивной таблицы
Менделеева. При нажатии на любой элемент, можно увидеть основную информацию о нем, что делает процесс изучения более
интуитивным и эффективным.

Кроме того, приложение включает в себя умный калькулятор, который позволяет рассчитывать атомную массу соединения,
определять степень окисления химических соединений и класс химического соединения.

Приложение также отличается своим визуальным оформлением. В процессе создания будет разработано несколько тем и общий
дизайн приложения с дружественным интерфейсом, что делает его приятным для пользования.

Для максимального комфорта, пользователи могут выбрать отображение приложения и способ взаимодействия с ним - через
консоль или через GUI интерфейс. Это делает Chemical Mayhem FX гибким и удобным для любых пользовательских предпочтений.

Сборка приложения осуществляется через следующие команды с помощью Maven Wrapper. :

```bash
./mvnw clean install
java -jar target/cmf-1.0-SNAPSHOT-shaded.jar
```

Запуск без сборки:

```bash
./mvnw clean javafx:run
```

Обратите внимание, что вам потребуется версия Java 17 и старше, прописанная в системную переменную JAVA_HOME.

Зависимости:

- javafx-controls: зависимость предоставляет набор компонентов управления JavaFX, таких как кнопки, текстовые поля,
  таблицы и т.д.
- javafx-fxml: зависимость предоставляет поддержку FXML - языка разметки, используемого для создания графического
  интерфейса пользователя в JavaFX. FXML позволяет разделить логику приложения и представление, что облегчает разработку
  и поддержку приложений JavaFX.
- maven-shade-plugin: плагин используется для создания самодостаточного исполняемого JAR-файла, который включает в себя
  все необходимые зависимости.
- maven-compiler-plugin: плагин используется для компиляции исходного кода приложения
- javafx-maven-plugin: плагин предоставляет поддержку JavaFX в Maven.
