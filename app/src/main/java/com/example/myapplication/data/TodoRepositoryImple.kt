package com.example.myapplication.data

import com.example.myapplication.domain.TodoRepository
import kotlinx.coroutines.flow.Flow


class TodoRepositoryImple(
    private val dao: TodoDao
): TodoRepository  {
    override suspend fun insertTodo(todo: Todo) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        dao.insertTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id)
    }

    override suspend fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }
}