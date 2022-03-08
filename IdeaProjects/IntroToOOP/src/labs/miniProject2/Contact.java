package labs.miniProject2;

public class Contact {
    private String name;
    private String mobile;
    private String work;
    private String home;
    private String city;

    public Contact() {
    }

    public Contact(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public Contact(String name, String mobile, String work, String home, String city) throws Exception {
        setName(name);
        setMobile(mobile);
        setWork(work);
        setHome(home);
        setCity(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if  (name == null || name.equals("")) {
            throw new Exception("Name is mandatory!");
        }
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) throws Exception {
        if (mobile == null || mobile.equals("")) {
            throw new Exception("Mobile is mandatory!");
        }
        if (validateIsNumber(mobile)) {
            this.mobile = mobile;
        } else {
          throw new Exception("Invalid input!");
        }
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) throws Exception {
        if (work.equals("") || validateIsNumber(work)) {
            this.work = work;
        } else {
            throw new Exception("Invalid input!");
        }
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) throws Exception {
        if (home.equals("") || validateIsNumber(home)) {
            this.home = home;
        } else {
            throw new Exception("Invalid input!");
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private boolean validateIsNumber(String number) {
        try {
            long n = Long.valueOf(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private String formatNumber(String number) {
        if (number.length() == 10) {
            return number.substring(0,3) + "-" + number.substring(3,6) + "-" + number.substring(6);
        } else {
            return number;
        }
    }

    @Override
    public String toString() {
        return "<" + this.name + "> (" +
                ((this.mobile == null || this.mobile.equals("")) ? "" : "Mobile=" + formatNumber(getMobile())) +
                ((this.work == null || this.work.equals("")) ? "" : ", Work=" + formatNumber(getWork())) +
                ((this.home == null || this.home.equals("")) ? "" : ", Home=" + formatNumber(getHome())) +
                ((this.city == null || this.city.equals("")) ? "" : ", City=" + formatNumber(getCity())) +
                ")";
    }
}
