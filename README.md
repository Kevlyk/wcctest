# wcctest
wcctest

1) follow database/setup.txt to setup mysql db

2) this project exposes 2 api:

curl --location --request GET 'http://localhost:8888/postcode/getDistanceBetweenPostcodes' \
> --header 'Content-Type: application/json' \
> --header 'Authorization: Basic d2NjOndjYw==' \
> --data-raw '{
>    "postcodeA":"AB10 1XG",
>    "postcodeB":"AB10 6RN"
> }'

{"postcodeLatLngA":{"postcode":"AB10 1XG","latitude":123.4,"longitude":234.5},"postcodeLatLngB":{"postcode":"AB10 6RN","latitude":57.13788,"longitude":-2.121487},"distance":3341.387005612628,"unit":"km"}



curl --location --request POST 'http://localhost:8888/postcode/setPostcodeLatLng' \
> --header 'Authorization: Basic d2NjOndjYw==' \
> --header 'Content-Type: application/json' \
> --data-raw '{
>     "postcodeLatLng":{
>         "postcode":"AAA",
>         "latitude": 123,
>         "longitude" : 321
>     }
> }'

{"isSet":true}
