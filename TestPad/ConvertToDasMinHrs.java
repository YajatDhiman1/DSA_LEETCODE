package TestPad;

int getDays(int sec)
{
    return sec/86400;
}
int getHours(int sec)
{
    sec = sec%86400;
    return sec/3600;
}
int getMinutes(int sec)
{
    sec=sec%3600;
    return sec/60;
}
int getSeconds(int sec)
{
    sec=sec%60;
    return sec;
}