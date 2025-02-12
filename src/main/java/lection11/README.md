# Задание 1 
Проект «Умный дом» развивается, и решено улучшить часть, отвечающую за радио.

Что нужно сделать: внедрить изменения в сам класс и тесты.

Как это сделать:

* модифицируете класс Radio под новые требования;
* делаете тест-дизайн новой версии класса, модифицируете или добавляете новые тесты;
* пушите всё на GitHub;
* удостоверьтесь, что все тесты в CI запускаются и проходят;


Требования к работе с радиостанциями

1. Можно задавать количество радиостанций при создании объекта, по умолчанию — 10.
2. Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций не включительно. То есть если станций 10, то номер последней — 9.
3. Если текущая радиостанция — максимальная, и клиент нажал на кнопку next на пульте, то текущей должна стать нулевая.
4. Если текущая радиостанция — 0, и клиент нажал на кнопку prev на пульте, то текущей должна стать максимальная.
5. Всё так же должен присутствовать сеттер текущей станции.

Теперь объекты радио в своём поле будут хранить и количество станций, заданное при создании объекта радио. Для этого вам понадобится создать свой конструктор для класса Radio с одним параметром, принимающим желаемое количество радиостанций и сохраняющим это значение у себя в поле. Ещё один конструктор потребуется без параметров, чтобы, если пользователь нашего класса не захотел указывать количество радиостанций, мы бы выставили их количество в 10 штук, как указано в требованиях, «по умолчанию — 10».

Внимание: конструктором с параметром задаётся именно количество радиостанций, а не номер максимальной, это разные вещи — если количество станций, например, 30, то последней будет номер 29, так как нумеруем мы с нуля.

Требования к работе с уровнем громкости звука:

* клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 100;
* если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить;
* если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить.

## Сделанное ДЗ
1. Radio и RadioTest - изменение класса и тестов под новые условия