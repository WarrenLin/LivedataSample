package com.livedata.model;

import java.util.List;

/**
 * Created by Warren on 2018/3/13.
 */

public class Weather{
    /**
     * query : {"count":1,"created":"2018-03-13T04:12:02Z","lang":"zh-TW","results":{"channel":{"units":{"distance":"km","pressure":"mb","speed":"km/h","temperature":"C"},"title":"Yahoo! Weather - Taipei City, TW","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/","description":"Yahoo! Weather for Taipei City, TW","language":"en-us","lastBuildDate":"Tue, 13 Mar 2018 12:12 PM CST","ttl":"60","location":{"city":"Taipei City","country":"Taiwan","region":" TW"},"wind":{"chill":"79","direction":"140","speed":"17.70"},"atmosphere":{"humidity":"48","pressure":"33796.17","rising":"0","visibility":"25.91"},"astronomy":{"sunrise":"6:5 am","sunset":"6:2 pm"},"image":{"title":"Yahoo! Weather","width":"142","height":"18","link":"http://weather.yahoo.com","url":"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"},"item":{"title":"Conditions for Taipei City, TW at 11:00 AM CST","lat":"25.037399","long":"121.564003","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/","pubDate":"Tue, 13 Mar 2018 11:00 AM CST","condition":{"code":"32","date":"Tue, 13 Mar 2018 11:00 AM CST","temp":"26","text":"Sunny"},"forecast":[{"code":"32","date":"13 Mar 2018","day":"Tue","high":"26","low":"16","text":"Sunny"},{"code":"30","date":"14 Mar 2018","day":"Wed","high":"26","low":"17","text":"Partly Cloudy"},{"code":"28","date":"15 Mar 2018","day":"Thu","high":"25","low":"20","text":"Mostly Cloudy"},{"code":"39","date":"16 Mar 2018","day":"Fri","high":"25","low":"18","text":"Scattered Showers"},{"code":"39","date":"17 Mar 2018","day":"Sat","high":"22","low":"18","text":"Scattered Showers"},{"code":"30","date":"18 Mar 2018","day":"Sun","high":"26","low":"18","text":"Partly Cloudy"},{"code":"28","date":"19 Mar 2018","day":"Mon","high":"26","low":"18","text":"Mostly Cloudy"},{"code":"12","date":"20 Mar 2018","day":"Tue","high":"26","low":"20","text":"Rain"},{"code":"39","date":"21 Mar 2018","day":"Wed","high":"22","low":"17","text":"Scattered Showers"},{"code":"30","date":"22 Mar 2018","day":"Thu","high":"24","low":"16","text":"Partly Cloudy"}],"description":"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/32.gif\"/>\n<BR />\n<b>Current Conditions:<\/b>\n<BR />Sunny\n<BR />\n<BR />\n<b>Forecast:<\/b>\n<BR /> Tue - Sunny. High: 26Low: 16\n<BR /> Wed - Partly Cloudy. High: 26Low: 17\n<BR /> Thu - Mostly Cloudy. High: 25Low: 20\n<BR /> Fri - Scattered Showers. High: 25Low: 18\n<BR /> Sat - Scattered Showers. High: 22Low: 18\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/\">Full Forecast at Yahoo! Weather<\/a>\n<BR />\n<BR />\n<BR />\n]]>","guid":{"isPermaLink":"false"}}}}}
     */

    private QueryBean query;

    public QueryBean getQuery() {
        return query;
    }

    public void setQuery(QueryBean query) {
        this.query = query;
    }

    public static class QueryBean {
        /**
         * count : 1
         * created : 2018-03-13T04:12:02Z
         * lang : zh-TW
         * results : {"channel":{"units":{"distance":"km","pressure":"mb","speed":"km/h","temperature":"C"},"title":"Yahoo! Weather - Taipei City, TW","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/","description":"Yahoo! Weather for Taipei City, TW","language":"en-us","lastBuildDate":"Tue, 13 Mar 2018 12:12 PM CST","ttl":"60","location":{"city":"Taipei City","country":"Taiwan","region":" TW"},"wind":{"chill":"79","direction":"140","speed":"17.70"},"atmosphere":{"humidity":"48","pressure":"33796.17","rising":"0","visibility":"25.91"},"astronomy":{"sunrise":"6:5 am","sunset":"6:2 pm"},"image":{"title":"Yahoo! Weather","width":"142","height":"18","link":"http://weather.yahoo.com","url":"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"},"item":{"title":"Conditions for Taipei City, TW at 11:00 AM CST","lat":"25.037399","long":"121.564003","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/","pubDate":"Tue, 13 Mar 2018 11:00 AM CST","condition":{"code":"32","date":"Tue, 13 Mar 2018 11:00 AM CST","temp":"26","text":"Sunny"},"forecast":[{"code":"32","date":"13 Mar 2018","day":"Tue","high":"26","low":"16","text":"Sunny"},{"code":"30","date":"14 Mar 2018","day":"Wed","high":"26","low":"17","text":"Partly Cloudy"},{"code":"28","date":"15 Mar 2018","day":"Thu","high":"25","low":"20","text":"Mostly Cloudy"},{"code":"39","date":"16 Mar 2018","day":"Fri","high":"25","low":"18","text":"Scattered Showers"},{"code":"39","date":"17 Mar 2018","day":"Sat","high":"22","low":"18","text":"Scattered Showers"},{"code":"30","date":"18 Mar 2018","day":"Sun","high":"26","low":"18","text":"Partly Cloudy"},{"code":"28","date":"19 Mar 2018","day":"Mon","high":"26","low":"18","text":"Mostly Cloudy"},{"code":"12","date":"20 Mar 2018","day":"Tue","high":"26","low":"20","text":"Rain"},{"code":"39","date":"21 Mar 2018","day":"Wed","high":"22","low":"17","text":"Scattered Showers"},{"code":"30","date":"22 Mar 2018","day":"Thu","high":"24","low":"16","text":"Partly Cloudy"}],"description":"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/32.gif\"/>\n<BR />\n<b>Current Conditions:<\/b>\n<BR />Sunny\n<BR />\n<BR />\n<b>Forecast:<\/b>\n<BR /> Tue - Sunny. High: 26Low: 16\n<BR /> Wed - Partly Cloudy. High: 26Low: 17\n<BR /> Thu - Mostly Cloudy. High: 25Low: 20\n<BR /> Fri - Scattered Showers. High: 25Low: 18\n<BR /> Sat - Scattered Showers. High: 22Low: 18\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/\">Full Forecast at Yahoo! Weather<\/a>\n<BR />\n<BR />\n<BR />\n]]>","guid":{"isPermaLink":"false"}}}}
         */

        private int count;
        private String created;
        private String lang;
        private ResultsBean results;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public ResultsBean getResults() {
            return results;
        }

        public void setResults(ResultsBean results) {
            this.results = results;
        }

        public static class ResultsBean {
            /**
             * channel : {"units":{"distance":"km","pressure":"mb","speed":"km/h","temperature":"C"},"title":"Yahoo! Weather - Taipei City, TW","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/","description":"Yahoo! Weather for Taipei City, TW","language":"en-us","lastBuildDate":"Tue, 13 Mar 2018 12:12 PM CST","ttl":"60","location":{"city":"Taipei City","country":"Taiwan","region":" TW"},"wind":{"chill":"79","direction":"140","speed":"17.70"},"atmosphere":{"humidity":"48","pressure":"33796.17","rising":"0","visibility":"25.91"},"astronomy":{"sunrise":"6:5 am","sunset":"6:2 pm"},"image":{"title":"Yahoo! Weather","width":"142","height":"18","link":"http://weather.yahoo.com","url":"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"},"item":{"title":"Conditions for Taipei City, TW at 11:00 AM CST","lat":"25.037399","long":"121.564003","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/","pubDate":"Tue, 13 Mar 2018 11:00 AM CST","condition":{"code":"32","date":"Tue, 13 Mar 2018 11:00 AM CST","temp":"26","text":"Sunny"},"forecast":[{"code":"32","date":"13 Mar 2018","day":"Tue","high":"26","low":"16","text":"Sunny"},{"code":"30","date":"14 Mar 2018","day":"Wed","high":"26","low":"17","text":"Partly Cloudy"},{"code":"28","date":"15 Mar 2018","day":"Thu","high":"25","low":"20","text":"Mostly Cloudy"},{"code":"39","date":"16 Mar 2018","day":"Fri","high":"25","low":"18","text":"Scattered Showers"},{"code":"39","date":"17 Mar 2018","day":"Sat","high":"22","low":"18","text":"Scattered Showers"},{"code":"30","date":"18 Mar 2018","day":"Sun","high":"26","low":"18","text":"Partly Cloudy"},{"code":"28","date":"19 Mar 2018","day":"Mon","high":"26","low":"18","text":"Mostly Cloudy"},{"code":"12","date":"20 Mar 2018","day":"Tue","high":"26","low":"20","text":"Rain"},{"code":"39","date":"21 Mar 2018","day":"Wed","high":"22","low":"17","text":"Scattered Showers"},{"code":"30","date":"22 Mar 2018","day":"Thu","high":"24","low":"16","text":"Partly Cloudy"}],"description":"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/32.gif\"/>\n<BR />\n<b>Current Conditions:<\/b>\n<BR />Sunny\n<BR />\n<BR />\n<b>Forecast:<\/b>\n<BR /> Tue - Sunny. High: 26Low: 16\n<BR /> Wed - Partly Cloudy. High: 26Low: 17\n<BR /> Thu - Mostly Cloudy. High: 25Low: 20\n<BR /> Fri - Scattered Showers. High: 25Low: 18\n<BR /> Sat - Scattered Showers. High: 22Low: 18\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/\">Full Forecast at Yahoo! Weather<\/a>\n<BR />\n<BR />\n<BR />\n]]>","guid":{"isPermaLink":"false"}}}
             */

            private ChannelBean channel;

            public ChannelBean getChannel() {
                return channel;
            }

            public void setChannel(ChannelBean channel) {
                this.channel = channel;
            }

            public static class ChannelBean {
                /**
                 * units : {"distance":"km","pressure":"mb","speed":"km/h","temperature":"C"}
                 * title : Yahoo! Weather - Taipei City, TW
                 * link : http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/
                 * description : Yahoo! Weather for Taipei City, TW
                 * language : en-us
                 * lastBuildDate : Tue, 13 Mar 2018 12:12 PM CST
                 * ttl : 60
                 * location : {"city":"Taipei City","country":"Taiwan","region":" TW"}
                 * wind : {"chill":"79","direction":"140","speed":"17.70"}
                 * atmosphere : {"humidity":"48","pressure":"33796.17","rising":"0","visibility":"25.91"}
                 * astronomy : {"sunrise":"6:5 am","sunset":"6:2 pm"}
                 * image : {"title":"Yahoo! Weather","width":"142","height":"18","link":"http://weather.yahoo.com","url":"http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"}
                 * item : {"title":"Conditions for Taipei City, TW at 11:00 AM CST","lat":"25.037399","long":"121.564003","link":"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/","pubDate":"Tue, 13 Mar 2018 11:00 AM CST","condition":{"code":"32","date":"Tue, 13 Mar 2018 11:00 AM CST","temp":"26","text":"Sunny"},"forecast":[{"code":"32","date":"13 Mar 2018","day":"Tue","high":"26","low":"16","text":"Sunny"},{"code":"30","date":"14 Mar 2018","day":"Wed","high":"26","low":"17","text":"Partly Cloudy"},{"code":"28","date":"15 Mar 2018","day":"Thu","high":"25","low":"20","text":"Mostly Cloudy"},{"code":"39","date":"16 Mar 2018","day":"Fri","high":"25","low":"18","text":"Scattered Showers"},{"code":"39","date":"17 Mar 2018","day":"Sat","high":"22","low":"18","text":"Scattered Showers"},{"code":"30","date":"18 Mar 2018","day":"Sun","high":"26","low":"18","text":"Partly Cloudy"},{"code":"28","date":"19 Mar 2018","day":"Mon","high":"26","low":"18","text":"Mostly Cloudy"},{"code":"12","date":"20 Mar 2018","day":"Tue","high":"26","low":"20","text":"Rain"},{"code":"39","date":"21 Mar 2018","day":"Wed","high":"22","low":"17","text":"Scattered Showers"},{"code":"30","date":"22 Mar 2018","day":"Thu","high":"24","low":"16","text":"Partly Cloudy"}],"description":"<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/32.gif\"/>\n<BR />\n<b>Current Conditions:<\/b>\n<BR />Sunny\n<BR />\n<BR />\n<b>Forecast:<\/b>\n<BR /> Tue - Sunny. High: 26Low: 16\n<BR /> Wed - Partly Cloudy. High: 26Low: 17\n<BR /> Thu - Mostly Cloudy. High: 25Low: 20\n<BR /> Fri - Scattered Showers. High: 25Low: 18\n<BR /> Sat - Scattered Showers. High: 22Low: 18\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/\">Full Forecast at Yahoo! Weather<\/a>\n<BR />\n<BR />\n<BR />\n]]>","guid":{"isPermaLink":"false"}}
                 */

                private UnitsBean units;
                private String title;
                private String link;
                private String description;
                private String language;
                private String lastBuildDate;
                private String ttl;
                private LocationBean location;
                private WindBean wind;
                private AtmosphereBean atmosphere;
                private AstronomyBean astronomy;
                private ImageBean image;
                private ItemBean item;

                public UnitsBean getUnits() {
                    return units;
                }

                public void setUnits(UnitsBean units) {
                    this.units = units;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getLanguage() {
                    return language;
                }

                public void setLanguage(String language) {
                    this.language = language;
                }

                public String getLastBuildDate() {
                    return lastBuildDate;
                }

                public void setLastBuildDate(String lastBuildDate) {
                    this.lastBuildDate = lastBuildDate;
                }

                public String getTtl() {
                    return ttl;
                }

                public void setTtl(String ttl) {
                    this.ttl = ttl;
                }

                public LocationBean getLocation() {
                    return location;
                }

                public void setLocation(LocationBean location) {
                    this.location = location;
                }

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public AtmosphereBean getAtmosphere() {
                    return atmosphere;
                }

                public void setAtmosphere(AtmosphereBean atmosphere) {
                    this.atmosphere = atmosphere;
                }

                public AstronomyBean getAstronomy() {
                    return astronomy;
                }

                public void setAstronomy(AstronomyBean astronomy) {
                    this.astronomy = astronomy;
                }

                public ImageBean getImage() {
                    return image;
                }

                public void setImage(ImageBean image) {
                    this.image = image;
                }

                public ItemBean getItem() {
                    return item;
                }

                public void setItem(ItemBean item) {
                    this.item = item;
                }

                public static class UnitsBean {
                    /**
                     * distance : km
                     * pressure : mb
                     * speed : km/h
                     * temperature : C
                     */

                    private String distance;
                    private String pressure;
                    private String speed;
                    private String temperature;

                    public String getDistance() {
                        return distance;
                    }

                    public void setDistance(String distance) {
                        this.distance = distance;
                    }

                    public String getPressure() {
                        return pressure;
                    }

                    public void setPressure(String pressure) {
                        this.pressure = pressure;
                    }

                    public String getSpeed() {
                        return speed;
                    }

                    public void setSpeed(String speed) {
                        this.speed = speed;
                    }

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }
                }

                public static class LocationBean {
                    /**
                     * city : Taipei City
                     * country : Taiwan
                     * region :  TW
                     */

                    private String city;
                    private String country;
                    private String region;

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public String getRegion() {
                        return region;
                    }

                    public void setRegion(String region) {
                        this.region = region;
                    }
                }

                public static class WindBean {
                    /**
                     * chill : 79
                     * direction : 140
                     * speed : 17.70
                     */

                    private String chill;
                    private String direction;
                    private String speed;

                    public String getChill() {
                        return chill;
                    }

                    public void setChill(String chill) {
                        this.chill = chill;
                    }

                    public String getDirection() {
                        return direction;
                    }

                    public void setDirection(String direction) {
                        this.direction = direction;
                    }

                    public String getSpeed() {
                        return speed;
                    }

                    public void setSpeed(String speed) {
                        this.speed = speed;
                    }
                }

                public static class AtmosphereBean {
                    /**
                     * humidity : 48
                     * pressure : 33796.17
                     * rising : 0
                     * visibility : 25.91
                     */

                    private String humidity;
                    private String pressure;
                    private String rising;
                    private String visibility;

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getPressure() {
                        return pressure;
                    }

                    public void setPressure(String pressure) {
                        this.pressure = pressure;
                    }

                    public String getRising() {
                        return rising;
                    }

                    public void setRising(String rising) {
                        this.rising = rising;
                    }

                    public String getVisibility() {
                        return visibility;
                    }

                    public void setVisibility(String visibility) {
                        this.visibility = visibility;
                    }
                }

                public static class AstronomyBean {
                    /**
                     * sunrise : 6:5 am
                     * sunset : 6:2 pm
                     */

                    private String sunrise;
                    private String sunset;

                    public String getSunrise() {
                        return sunrise;
                    }

                    public void setSunrise(String sunrise) {
                        this.sunrise = sunrise;
                    }

                    public String getSunset() {
                        return sunset;
                    }

                    public void setSunset(String sunset) {
                        this.sunset = sunset;
                    }
                }

                public static class ImageBean {
                    /**
                     * title : Yahoo! Weather
                     * width : 142
                     * height : 18
                     * link : http://weather.yahoo.com
                     * url : http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif
                     */

                    private String title;
                    private String width;
                    private String height;
                    private String link;
                    private String url;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }

                public static class ItemBean {
                    /**
                     * title : Conditions for Taipei City, TW at 11:00 AM CST
                     * lat : 25.037399
                     * long : 121.564003
                     * link : http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/
                     * pubDate : Tue, 13 Mar 2018 11:00 AM CST
                     * condition : {"code":"32","date":"Tue, 13 Mar 2018 11:00 AM CST","temp":"26","text":"Sunny"}
                     * forecast : [{"code":"32","date":"13 Mar 2018","day":"Tue","high":"26","low":"16","text":"Sunny"},{"code":"30","date":"14 Mar 2018","day":"Wed","high":"26","low":"17","text":"Partly Cloudy"},{"code":"28","date":"15 Mar 2018","day":"Thu","high":"25","low":"20","text":"Mostly Cloudy"},{"code":"39","date":"16 Mar 2018","day":"Fri","high":"25","low":"18","text":"Scattered Showers"},{"code":"39","date":"17 Mar 2018","day":"Sat","high":"22","low":"18","text":"Scattered Showers"},{"code":"30","date":"18 Mar 2018","day":"Sun","high":"26","low":"18","text":"Partly Cloudy"},{"code":"28","date":"19 Mar 2018","day":"Mon","high":"26","low":"18","text":"Mostly Cloudy"},{"code":"12","date":"20 Mar 2018","day":"Tue","high":"26","low":"20","text":"Rain"},{"code":"39","date":"21 Mar 2018","day":"Wed","high":"22","low":"17","text":"Scattered Showers"},{"code":"30","date":"22 Mar 2018","day":"Thu","high":"24","low":"16","text":"Partly Cloudy"}]
                     * description : <![CDATA[<img src="http://l.yimg.com/a/i/us/we/52/32.gif"/>
                     <BR />
                     <b>Current Conditions:</b>
                     <BR />Sunny
                     <BR />
                     <BR />
                     <b>Forecast:</b>
                     <BR /> Tue - Sunny. High: 26Low: 16
                     <BR /> Wed - Partly Cloudy. High: 26Low: 17
                     <BR /> Thu - Mostly Cloudy. High: 25Low: 20
                     <BR /> Fri - Scattered Showers. High: 25Low: 18
                     <BR /> Sat - Scattered Showers. High: 22Low: 18
                     <BR />
                     <BR />
                     <a href="http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-20070568/">Full Forecast at Yahoo! Weather</a>
                     <BR />
                     <BR />
                     <BR />
                     ]]>
                     * guid : {"isPermaLink":"false"}
                     */

                    private String title;
                    private String lat;
                    @com.google.gson.annotations.SerializedName("long")
                    private String longX;
                    private String link;
                    private String pubDate;
                    private ConditionBean condition;
                    private String description;
                    private GuidBean guid;
                    private List<ForecastBean> forecast;

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getLat() {
                        return lat;
                    }

                    public void setLat(String lat) {
                        this.lat = lat;
                    }

                    public String getLongX() {
                        return longX;
                    }

                    public void setLongX(String longX) {
                        this.longX = longX;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public String getPubDate() {
                        return pubDate;
                    }

                    public void setPubDate(String pubDate) {
                        this.pubDate = pubDate;
                    }

                    public ConditionBean getCondition() {
                        return condition;
                    }

                    public void setCondition(ConditionBean condition) {
                        this.condition = condition;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public GuidBean getGuid() {
                        return guid;
                    }

                    public void setGuid(GuidBean guid) {
                        this.guid = guid;
                    }

                    public List<ForecastBean> getForecast() {
                        return forecast;
                    }

                    public void setForecast(List<ForecastBean> forecast) {
                        this.forecast = forecast;
                    }

                    public static class ConditionBean {
                        /**
                         * code : 32
                         * date : Tue, 13 Mar 2018 11:00 AM CST
                         * temp : 26
                         * text : Sunny
                         */

                        private String code;
                        private String date;
                        private String temp;
                        private String text;

                        public String getCode() {
                            return code;
                        }

                        public void setCode(String code) {
                            this.code = code;
                        }

                        public String getDate() {
                            return date;
                        }

                        public void setDate(String date) {
                            this.date = date;
                        }

                        public String getTemp() {
                            return temp;
                        }

                        public void setTemp(String temp) {
                            this.temp = temp;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }
                    }

                    public static class GuidBean {
                        /**
                         * isPermaLink : false
                         */

                        private String isPermaLink;

                        public String getIsPermaLink() {
                            return isPermaLink;
                        }

                        public void setIsPermaLink(String isPermaLink) {
                            this.isPermaLink = isPermaLink;
                        }
                    }

                    public static class ForecastBean {
                        /**
                         * code : 32
                         * date : 13 Mar 2018
                         * day : Tue
                         * high : 26
                         * low : 16
                         * text : Sunny
                         */

                        private String code;
                        private String date;
                        private String day;
                        private String high;
                        private String low;
                        private String text;

                        public String getCode() {
                            return code;
                        }

                        public void setCode(String code) {
                            this.code = code;
                        }

                        public String getDate() {
                            return date;
                        }

                        public void setDate(String date) {
                            this.date = date;
                        }

                        public String getDay() {
                            return day;
                        }

                        public void setDay(String day) {
                            this.day = day;
                        }

                        public String getHigh() {
                            return high;
                        }

                        public void setHigh(String high) {
                            this.high = high;
                        }

                        public String getLow() {
                            return low;
                        }

                        public void setLow(String low) {
                            this.low = low;
                        }

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }
                    }
                }
            }
        }
    }
}
