#language: ru
@test
Функционал: Поиск на авито

  Структура сценария: Найдем самые дорогие принтеры на авито
    Пусть открыт ресурс авито
    И в выпадающем списке категорий выбрана оргтехника
    И в поле поиска введено значение <техника>
    И активирован чекбокс только с фотографией
    Тогда кликнуть по выпадающему списку региона
    Тогда в поле регион введено значение <город>
    И нажата кнопка показать объявления
    Тогда открылась страница результаты по запросу <искомая техника>
    И в выпадающем списке сортировка выбрано значение Дороже
    И в консоль выведено значение названия и цены <количество> первых товаров

    Примеры:
      | техника    | город       | искомая техника | количество |
      | принтер    | Владивосток | принтер         | 3          |
      | канцелярия | Саратов     | канцелярия      | 2          |