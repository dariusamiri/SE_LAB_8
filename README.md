# آزمایش ۸ مهندسی نرم افزار

## بخش اول 
طبق توضیحات،‌ your kit را نصب کرده و پلاگین را نصب کردیم.
پس از ران کردن،‌ نتیجه زیر بدست آمد:
<img width="1512" alt="Screenshot 1402-10-26 at 15 56 45" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/dbdf7a1a-34ea-478b-934a-619e3f4c8690">

<img width="1512" alt="Screenshot 1402-10-26 at 15 57 07" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/b8c260b3-977d-4cd6-b5e4-bf3621e48ece">

<img width="1512" alt="Screenshot 1402-10-26 at 15 57 32" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/bf4fcddb-884d-44c0-b305-aea203201e72">

مانطور که در تصاویر بالا مشاهده می‌کنیم، cpu time بیشتر برای تابع ()temp خرج شده‌است. برای بهبود این تابع، از تابع زیر استفاده می‌کنیم.

<img width="1512" alt="Screenshot 1402-10-26 at 16 02 41" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/aa81448e-f874-4e59-9580-a9e7a1fa63dc">

به این ترتیب با عدم استفاده از arraylist، از یک آرایه جند بعدی استاتیک استفاده می‌کنیم.
مجددا با Your it پروژه را ران می‌کنیم و نتیجه را در تصاویر زیر مشاهده می‌کنیم:

<img width="1512" alt="Screenshot 1402-10-26 at 16 07 01" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/8608f78c-a33e-4c0d-8ef1-e3e2c390276f">

<img width="1512" alt="Screenshot 1402-10-26 at 16 07 09" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/ccbb1a7f-d154-4e59-95cb-bbd21e3a8fb0">

<img width="1512" alt="Screenshot 1402-10-26 at 16 07 16" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/c522f4ce-4e27-4c19-9174-787fb9b9b093">

تفاوت آشکاری پدیده آمده را به وضوح می‌توان دید که cpu time تابع ()main کلاس JavaCup از ۹۴۶ ثانیه به ۲۲ ثانیه تقلیل یافته است که مقدار بسیار زیادی است و نشان می‌دهد تابع جدیدی که نوشتیم مشکل را تا حد بسیار خوبی حل کرده است.


## بخش دوم
### الگوریتم فیبوناچی غیر بهینه

الگوریتم تابع فیبوناچی را پیاده سازی می‌کنیم. تابع آن را در کلاس Fibonacci پیاده سازی می‌کنیم. کد آن به شرح زیر است.

<img width="1512" alt="Screenshot 1402-10-26 at 17 00 27" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/41058925-94b1-4bf9-b48f-7b1dd5b7c662">


در ادامه نتایج Your Kit را هم قرار می‌دهیم.


<img width="1512" alt="Screenshot 1402-10-26 at 17 05 05" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/6dfb12d1-fb9b-43e3-8637-06033467d3ad">

<img width="1512" alt="Screenshot 1402-10-26 at 17 05 09" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/037c71cc-7508-45ab-b3c0-61eea4886f66">




### الگوریتم فیبوناچی بهینه

الگوریتم تابع فیبوناچی بهینه شده را پیاده سازی می‌کنیم. تابع آن را در کلاس OptimizedFibonacci پیاده سازی می‌کنیم. کد آن به شرح زیر است.

<img width="1512" alt="Screenshot 1402-10-26 at 17 07 50" src="https://github.com/dariusamiri/SE_LAB_8/assets/59167222/66d0151f-4552-453c-a963-f7772817a40c">




