package com.example.tarefa1.api_interface;

import com.example.tarefa1.model.Post;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
public interface PostService {
    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/{id}")
    Call<Post> getPostById(@Path("id") int postId);

    @GET("posts")
    Call<List<Post>> getPostsByUserId(@Query("userId") int userId);


}
