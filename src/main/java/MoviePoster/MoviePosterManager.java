package MoviePoster;

public class MoviePosterManager {
    private String[] movies = new String[0];
    private int limit;

    public MoviePosterManager() {
        limit = 10;
    }

    public MoviePosterManager(int limit) {
        this.limit = limit;
    }

    //    Реализация добавления фильмов
    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    // Возврат лимита
    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] ans = new String[resultLength];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies[movies.length - 1 - i];
        }
        return ans;
    }
}
