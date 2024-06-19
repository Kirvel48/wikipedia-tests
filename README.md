# Проект по автоматизации тестирования сайта [Википедия](https://ru.wikipedia.org/)
> Википедия является самым крупным и наиболее читаемым справочником, а также самой полной энциклопедией из когда-либо создававшихся за всю историю человечества.

## Содержание:

- <a href="#tools">[Технологии и инструменты]

- <a href="#autotests">[Запуск тестов из терминала]</a>

- <a href="#allure">[Сборка в Jenkins]</a>
- <a href="#allure">[Пример Allure-отчета]</a>
[- [Интеграция с Allure TestOps] ]({https://allure.autotests.cloud/project/4272/dashboards})
- <a href="#telegram">[Уведомления в Telegram]</a>
- [Видео примера запуска тестов в Selenoid]
--- 

<a id="tools"></a>

## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/Selenium.svg" width="50" height="50"  alt="Selenium"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

---
<a id="autotests"></a>
## Запуск web-тестов из терминала
Команда для запуска тестов локально: 
```
gradle clean web

```
## Команда для запуска тестов: 

```agsl
clean ${TAGS} 
-Dbrowser=${BROWSER} 
-DbaseUrl=${BASEURL} 
-DbrowserSize=${BROWSERSIZE}
```
---

## Запуск mobile-тестов в browserstack из терминала 

```
.\gradlew clean mobile -DdeviceHost=browserstack
```
## Запуск mobile-тестов локально из терминала

```
.\gradlew clean mobile -DdeviceHost=emulation
```
  
<a id="jenkins"></a>
  
## Сборка в [Jenkins](https://jenkins.autotests.cloud/job/wikiTests/)
Для запуска необходимо перейти в Build with Parameters и нажать Build.
<img src=images/Jenkins.jpg>

---
<a id="allure"></a>

## Пример Allure-отчета
Основная страница отчета:
<img src=images/AllureStart.jpg>
Страница с шагами и подробной информацией о результате каждого кейса
<img src=images/AllureSteps.jpg>





---
<a id="telegram"></a>

## Уведомления в Telegram
Информация о результатах проходжения тестов поступает в Telegram через специального бота

<img src=images/TelegramNot.jpg>
