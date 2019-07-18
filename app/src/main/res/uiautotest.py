qimport unittest
import uiautomator2 as u2
from time import sleep
import time

class TestCalculator(unittest.TestCase):
    def test_add(self):
        d(text="AC").click()
        image = d.screenshot()
        image.save("calculator.jpg")
        d(text="9").click()
        d(text="+").click()
        d(text="3").click()
        d(text="=").click()
        image = d.screenshot()
        image.save("add.jpg")
        ans = d(resourceId=url+strId+"textview").get_text()
        self.assertEqual(ans, '12','method add test failed')

    def test_subtract(self):
        d(text="AC").click()
        d(text="2").click()
        d(text="-").click()
        d(text="7").click()
        d(text="=").click()
        image = d.screenshot()
        image.save("subtract.jpg")
        ans = d(resourceId=url+strId+"textview").get_text()
        self.assertEqual(ans, '-5','method add test failed')

    def test_multiply(self):
        d(text="AC").click()
        d(text="5").click()
        d(text="*").click()
        d(text="6").click()
        d(text="=").click()
        image = d.screenshot()
        image.save("multiply.jpg")
        ans = d(resourceId=url+strId+"textview").get_text()
        self.assertEqual(ans, '30','method add test failed')

    def test_divide(self):
        d(text="AC").click()
        d(text="1").click()
        d(text="2").click()
        d(text="/").click()
        d(text="3").click()
        d(text="=").click()
        image = d.screenshot()
        image.save("divide.jpg")
        ans = d(resourceId=url+strId+"textview").get_text()
        self.assertEqual(ans, '4','method add test failed')
    

def test_main():
        start()
        login()
        test_add()
        test_divide()
        end()
        

def start():
    d.app_start(url)
    time.sleep(3)

def login():
    image = d.screenshot()
    image.save("login.jpg")
    d(resourceId=url+strId+"login_username").set_text("login")
    d(resourceId=url+strId+"login_password").set_text("bean")
    d(resourceId=url+strId+"login_btn_login").click()
    time.sleep(3)

def end():
    d.app_stop(url)

    

url = "com.example.a12579.apptest"
strId = ":id/"
d = u2.connect("emulator-5554")
start()
login()
if __name__ == '__main__':
	unittest.main()
	end()

