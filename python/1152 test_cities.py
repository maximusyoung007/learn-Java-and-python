import unittest
from city_function import Country

class CityTestCase(unittest.TestCase):
    def test_city_country_name(self):
        info = Country('nanjing','china')
        self.assertEqual(info,"Nanjing China")
unittest.main()