package com.liukaining.design_pattern.abstract_factory;

import com.liukaining.design_pattern.abstract_factory.factory.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example1: java Main listfactory.ListFactory");
            System.out.println("Example1: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("people", "http://www.people.com.cn");
        Link gmw = factory.createLink("gmw", "http://www.gmw.cn");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray trayNews = factory.createTray("news");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("search");
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "LiuKaining");
        page.add(trayNews);
        page.add(trayYahoo);
        page.add(traySearch);
        page.output();

    }
}
