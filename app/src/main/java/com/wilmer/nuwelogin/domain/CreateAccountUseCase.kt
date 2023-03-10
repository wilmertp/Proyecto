package com.wilmer.nuwelogin.domain

import com.wilmer.nuwelogin.data.network.AuthenticationService
import com.wilmer.nuwelogin.data.network.UserService
import com.wilmer.nuwelogin.ui.signin.model.UserSignIn
import javax.inject.Inject

class CreateAccountUseCase @Inject constructor(
    private val authenticationService: AuthenticationService,
    private val userService: UserService
) {

    suspend operator fun invoke(userSignIn: UserSignIn): Boolean {
        val accountCreated =
            authenticationService.createAccount(userSignIn.email, userSignIn.password) != null
        return if (accountCreated) {
            userService.createUserTable(userSignIn)
        } else {
            false
        }
    }
}