package com.bridgelabz.quantitymeasurement.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Quantity Measurement Backend</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            background: #0f172a;
                            color: white;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            height: 100vh;
                            margin: 0;
                        }
                        .card {
                            text-align: center;
                            background: #1e293b;
                            padding: 40px;
                            border-radius: 16px;
                            box-shadow: 0 10px 30px rgba(0,0,0,0.3);
                        }
                        h1 {
                            margin-bottom: 10px;
                        }
                        p {
                            color: #cbd5e1;
                        }
                    </style>
                </head>
                <body>
                    <div class="card">
                        <h1>Quantity Measurement Backend</h1>
                        <p>Backend is running successfully</p>
                    </div>
                </body>
                </html>
                """;
    }
}