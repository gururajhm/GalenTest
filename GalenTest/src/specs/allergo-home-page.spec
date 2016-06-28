==================================================
header                      id          main-header
search-input                xpath       //*[@id='main-search-text']
main-navigation-menu        xpath       //div[@class='main-nav clearfix']
==================================================

@ Header | *
---------------------------------------------
header
    above: main-navigation-menu

@ Search Form | *
---------------------------------------------
search-input
    css color is: rgba(48, 48, 48, 1)

@ Main Navigation Menu | *
---------------------------------------------
main-navigation-menu
    below: header